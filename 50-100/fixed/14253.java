public void onRefreshButtonClicked(android.view.View view) {
    mTracker.send(new com.google.android.gms.analytics.HitBuilders.EventBuilder().setCategory("Action").setAction("Refresh book listing").build());
    java.lang.System.out.println("in onRefreshButtonClicked");
    if (!(findViewById(R.id.forSaleButton).isEnabled())) {
        book4SaleListFragment.refreshList();
    }else {
        bookWantedListFragment.refreshList();
    }
}