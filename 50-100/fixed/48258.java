private void finishUpload() {
    if (((failed) + (success)) == 0) {
        return ;
    }
    showProgressBar(false, "");
    if ((failed) > 0) {
        toastManager.show(java.lang.String.format(java.util.Locale.CHINA, getResources().getString(R.string.upload_failed), success, failed));
    }else {
        toastManager.show(getResources().getString(R.string.upload_success));
    }
    success = 0;
    failed = 0;
}