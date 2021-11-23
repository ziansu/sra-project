boolean isFileSaveEnabled() {
    return (codepath.apps.demointroandroid.ScoreKeeperUtils.getTodayAsNoTimeString().equals(fileSaveFeatureDate)) && (fileSaveForToday);
}