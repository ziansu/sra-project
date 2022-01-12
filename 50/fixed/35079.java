private int getNumOfPoints() {
    if (!(isAdded())) {
        return 0;
    }
    if (org.wordpress.android.ui.stats.StatsUIHelper.shouldLoadMoreBars()) {
        return 10;
    }else {
        return 7;
    }
}