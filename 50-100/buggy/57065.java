public boolean validateSyncUrlEntry(org.addhen.smssync.views.AddSyncUrl addSyncUrl) {
    boolean noError = false;
    if (addSyncUrl != null) {
        if (android.text.TextUtils.isEmpty(addSyncUrl.title.getText().toString())) {
            toastLong(R.string.empty_sync_url_title);
        }else
            if (!(org.addhen.smssync.util.Util.isValidCallbackUrl(addSyncUrl.url.getText()))) {
                toastLong(R.string.valid_sync_url);
            }else {
                noError = true;
            }
        
    }
    return noError;
}