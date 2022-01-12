@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    mWakeLock.release();
    sharedProgressDialog.dismiss();
    if (result == null) {
        outputView.append(((getString(R.string.toast_download_version_error)) + "\n"));
        return ;
    }
    outputView.append(((getString(R.string.toast_download_version_ok)) + "\n"));
    downloadBinary(result, donexteabi());
}