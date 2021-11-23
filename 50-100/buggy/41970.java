@java.lang.Override
protected void onPostExecute(fr.sims.coachingproject.util.NetworkUtil.Response response) {
    if ((response != null) && (response.isSuccessful())) {
        android.support.design.widget.Snackbar.make(mMainLayout, R.string.request_sent, Snackbar.LENGTH_SHORT).show();
    }else {
        android.support.design.widget.Snackbar.make(mMainLayout, R.string.request_error, Snackbar.LENGTH_SHORT).show();
        mSendRequestBt.setEnabled(false);
    }
}