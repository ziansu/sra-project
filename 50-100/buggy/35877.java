private void initRecyclerView() {
    transactionsAdapter = new com.robotnec.budget.app.adapters.transaction.TransactionsAdapter(getContext());
    homeHeader = new com.robotnec.budget.app.adapters.HomeHeader();
    headerAdapter = new com.robotnec.budget.app.adapters.support.HeaderAdapter(transactionsAdapter, homeHeader);
    recyclerMerge.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(getContext()));
    recyclerMerge.setHasFixedSize(true);
    recyclerMerge.setAdapter(headerAdapter);
}