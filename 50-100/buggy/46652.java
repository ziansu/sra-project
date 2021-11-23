public void createWatchDogView() {
    oneColumn = nl.tudelft.watchdog.intellij.ui.util.UIUtils.createVerticalBoxJPanel(parent);
    if (!(nl.tudelft.watchdog.intellij.util.WatchDogUtils.isWatchDogActive(nl.tudelft.watchdog.intellij.util.WatchDogUtils.getProject()))) {
        createInactiveViewContent();
    }else {
        calculateTimes();
        latestDebugIntervals = intervalStatistics.getLatestDebugIntervals(nl.tudelft.watchdog.intellij.ui.WatchDogView.NUMBER_OF_INTERVALS_TO_SHOW);
        if (selectedDebugIntervalShouldBeReset()) {
            selectedDebugInterval = latestDebugIntervals.get(0);
        }
        createActiveView();
        makeScrollable();
    }
    createRefreshLink(intervalSelection);
}