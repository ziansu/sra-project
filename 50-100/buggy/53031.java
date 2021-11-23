@java.lang.Override
public void run() {
    if (tvStartDate.getText().toString().equals("- - / - - / - - - -")) {
        currentPage = 1;
        workHistoryPresenter.getInfoWorkHistory(currentPage, simpleDateFormat.format(endDate));
    }else {
        currentPageTime = 1;
        workHistoryPresenter.getInfoWorkHistoryTime(simpleDateFormat.format(startDate), simpleDateFormat.format(endDate), currentPage);
    }
    mSwipeRefreshLayout.setRefreshing(false);
}