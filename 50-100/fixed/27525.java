@java.lang.Override
protected void onPause() {
    super.onPause();
    android.app.ProgressDialog pgdl = com.environer.becofriend.data.FetchAllData.progressDialog;
    if ((pgdl != null) && (pgdl.isShowing()))
        FetchAllData.progressDialog.dismiss();
    
    android.app.ProgressDialog pgdlcity = com.environer.becofriend.data.FetchCityData.progressDialog;
    if ((pgdlcity != null) && (pgdlcity.isShowing()))
        pgdlcity.dismiss();
    
    com.google.android.exoplayer2.SimpleExoPlayer exo = com.environer.becofriend.adapter.ContentAdapter.returnInstance();
    if (exo != null) {
        exo.release();
        exo.stop();
        exo = null;
    }
}