@java.lang.Override
public void onLoaderReset(android.support.v4.content.Loader<org.onebusaway.android.io.request.ObaArrivalInfoResponse> loader) {
    showProgress(false);
    mAdapter.setData(null, mRoutesFilter, java.lang.System.currentTimeMillis());
    mArrivalInfo = null;
    if ((mHeader) != null) {
        mHeader.refresh();
    }
}