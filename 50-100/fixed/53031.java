@java.lang.Override
public void run() {
    if (tvStartDate.getText().toString().equals("- - / - - / - - - -")) {
        workHistoryPresenter.getInfoWorkHistory(currentPage, simpleDateFormat.format(endDate));
    }else {
        workHistoryPresenter.getInfoWorkHistoryTime(simpleDateFormat.format(startDate), simpleDateFormat.format(endDate), currentPageTime);
    }
    mSwipeRefreshLayout.setRefreshing(false);
}