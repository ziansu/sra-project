@java.lang.Override
public void onResume() {
    if ((mGridLayoutmanager.getSpanCount()) != (numberOfColumns())) {
        mGridLayoutmanager = new android.support.v7.widget.GridLayoutManager(getActivity(), numberOfColumns());
        mGridView.setLayoutManager(mGridLayoutmanager);
        ((org.bottiger.podcast.adapters.SubscriptionCursorAdapter) (mGridView.getAdapter())).setNumberOfColumns(numberOfColumns());
    }
    super.onResume();
}