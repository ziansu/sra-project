public com.nguyen.andy.kisetsu.SeasonItem getPrevSeason() {
    com.nguyen.andy.kisetsu.SeasonItem prevSeason = null;
    int prevSeasonMonth = (this.month) - (com.nguyen.andy.kisetsu.SeasonItem.SEASON_LENGTH);
    int prevSeasonYear = this.year;
    if (prevSeasonMonth < 1) {
        prevSeasonMonth += com.nguyen.andy.kisetsu.SeasonItem.YEAR_LENGTH;
        prevSeasonYear--;
    }
    return new com.nguyen.andy.kisetsu.SeasonItem(prevSeasonMonth, prevSeasonYear);
}