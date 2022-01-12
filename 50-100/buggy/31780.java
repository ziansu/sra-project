private void initializeData() {
    java.util.ArrayList<dev.paytrack.paytrack.domain.Transaction> transactions = ((java.util.ArrayList<dev.paytrack.paytrack.domain.Transaction>) (transactionService.getTransactionsByOriginIbanBetweenDates(null, dev.paytrack.paytrack.utils.DateUtils.parseStringToDate(startDate), dev.paytrack.paytrack.utils.DateUtils.parseStringToDate(endDate))));
    android.support.v7.widget.RecyclerView recyclerView = ((android.support.v7.widget.RecyclerView) (findViewById(R.id.recycler_view)));
    android.support.v7.widget.LinearLayoutManager linearLayoutManager = new android.support.v7.widget.LinearLayoutManager(this);
    assert recyclerView != null;
    recyclerView.setLayoutManager(linearLayoutManager);
    recyclerView.setAdapter(new dev.paytrack.paytrack.adapter.TransactionAdapter(transactions));
}