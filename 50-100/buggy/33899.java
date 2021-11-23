@java.lang.Override
public void onResume() {
    super.onResume();
    if ((mGridLayoutmanager.getSpanCount()) != (numberOfColumns())) {
        android.support.v7.widget.GridLayoutManager layoutmanager = new android.support.v7.widget.GridLayoutManager(getActivity(), numberOfColumns());
        mGridView.setLayoutManager(layoutmanager);
        ((org.bottiger.podcast.adapters.SubscriptionCursorAdapter) (mGridView.getAdapter())).setNumberOfColumns(numberOfColumns());
    }
}