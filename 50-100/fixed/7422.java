@java.lang.Override
protected com.rastating.droidbeard.entities.TVShow doInBackground(java.lang.Long... longs) {
    long tvdbid = longs[0];
    com.rastating.droidbeard.entities.TVShow show = getTVShow(tvdbid);
    if (show != null) {
        java.util.List<com.rastating.droidbeard.entities.Season> seasons = getSeasons(tvdbid);
        if (seasons != null) {
            java.util.Collections.sort(seasons, new com.rastating.droidbeard.comparators.SeasonComparator());
            java.util.Collections.reverse(seasons);
            show.setSeasons(seasons);
        }
    }
    return show;
}