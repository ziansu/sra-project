@java.lang.Override
public void onLoaderReset(android.support.v4.content.Loader<org.onebusaway.android.io.request.ObaArrivalInfoResponse> loader) {
    org.onebusaway.android.util.UIUtils.showProgress(this, false);
    mAdapter.setData(null, mRoutesFilter, java.lang.System.currentTimeMillis());
    mArrivalInfo = null;
    if ((mHeader) != null) {
        mHeader.refresh();
    }
}