@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == (com.freshmen.wtgf.App.DetailActivity.RECOVERY_DIALOG_REQUEST)) {
        getYouTubePlayerProvider().initialize(Config.DEVELOPER_KEY, this);
    }
    callbackManager.onActivityResult(requestCode, resultCode, data);
}