private void resetStats() {
    reportCounter.setTextColor(android.support.v4.content.ContextCompat.getColor(this, R.color.base_blue));
    reportCountLabel.setTextColor(android.support.v4.content.ContextCompat.getColor(this, R.color.base_blue));
    actionCounter.setTextColor(android.support.v4.content.ContextCompat.getColor(this, R.color.material_blue_grey950));
    actionCountLabel.setTextColor(android.support.v4.content.ContextCompat.getColor(this, R.color.material_blue_grey950));
    actionFocus = false;
    timeLineContainer.setRefreshing(true);
    fetchReports(5, 1, buildQuery(true, null), true, true);
}