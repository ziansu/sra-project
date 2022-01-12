@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    if ((mProgressDialog) != null) {
        mProgressDialog.setTitle("Cleaning tiles");
        mProgressDialog.setMessage(zoomMessage(mZoomMin, mZoomMin, mZoomMax));
        int total = possibleTilesInArea(mBB, mZoomMin, mZoomMax);
        mProgressDialog.setMax(total);
        mProgressDialog.show();
    }
}