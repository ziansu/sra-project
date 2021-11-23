void setupRulesRecyclerView(java.util.List<pl.mareklangiewicz.myutils.MyCommands.RERule> rules) {
    resetRulesRecyclerView();
    android.support.v7.widget.LinearLayoutManager manager = new pl.mareklangiewicz.myintent.WCLinearLayoutManager(mRulesRecyclerView.getContext());
    mRulesRecyclerView.setLayoutManager(manager);
    mRulesRecyclerView.setItemAnimator(null);
    final pl.mareklangiewicz.myintent.RERulesAdapter adapter = new pl.mareklangiewicz.myintent.RERulesAdapter();
    adapter.setRules(rules);
    mRulesRecyclerView.setAdapter(adapter);
    mItemTouchHelper = new android.support.v7.widget.helper.ItemTouchHelper(new pl.mareklangiewicz.myintent.RERulesTouchHelperCallback(adapter));
    mItemTouchHelper.attachToRecyclerView(mRulesRecyclerView);
}