private void updateLineItems() {
    java.util.List<org.sebbas.android.memegenerator.LineItem> lineItems;
    switch (mLayoutMode) {
        case org.sebbas.android.memegenerator.fragments.RecyclerFragment.GRID_LAYOUT :
        case org.sebbas.android.memegenerator.fragments.RecyclerFragment.LIST_LAYOUT :
            lineItems = mDataLoader.getLineItems();
            break;
        case org.sebbas.android.memegenerator.fragments.RecyclerFragment.SUPER_SLIM_LAYOUT :
            lineItems = mDataLoader.getSuperSlimLineItems();
            break;
        default :
            lineItems = mDataLoader.getLineItems();
    }
    android.util.Log.d(org.sebbas.android.memegenerator.fragments.RecyclerFragment.TAG, ("line items size is: " + (lineItems.size())));
    mRecyclerFragmentAdapter.setLineItems(lineItems);
}