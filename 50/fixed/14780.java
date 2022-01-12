@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parentView, android.view.View selectedItemView, int position, long id) {
    mGradientSource = position;
    if ((mTrackSegments.size()) != 0) {
        mCustomMapFragment.plotRoute(mTrackSegments, mGradientSource, false);
    }
}