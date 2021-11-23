boolean isFileSaveEnabled() {
    if (codepath.apps.demointroandroid.ScoreKeeperUtils.getTodayAsNoTimeString().equals(fileSaveFeatureDate)) {
        return fileSaveForToday;
    }
    return false;
}