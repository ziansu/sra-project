private void loadTransactionList() {
    this.showViewLoading();
    this.getMonthlyOverallTransactionList(null);
    this.setTimeframeSpinner();
    this.getCategoryHistoryList();
    this.setCategorySpinner();
}