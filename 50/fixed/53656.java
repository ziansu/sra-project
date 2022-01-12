@java.lang.Override
protected void onActivityResult(int requestCode, int responseCode, android.content.Intent intent) {
    super.onActivityResult(requestCode, responseCode, intent);
    if (callbackManager.onActivityResult(requestCode, responseCode, intent)) {
        return ;
    }
}