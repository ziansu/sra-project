private void loadTransactionList() {
    this.showViewLoading();
    this.getMonthlyOverallTransactionList(null);
    this.setTimeframeSpinner();
    this.setCategorySpinner();
    this.getCategoryHistoryList();
}