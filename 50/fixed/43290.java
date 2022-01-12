@java.lang.Override
public void run() {
    if (analyticsData != null) {
        int totalAnswered = analyticsData.pieCorrectAndTotalValues[1];
        if (totalAnswered > 0) {
            displayAnalytics(analyticsData);
        }else {
            showNoAnalytics();
        }
    }else {
        showNoAnalytics();
    }
}