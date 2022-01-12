@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (com.simplify.android.sdk.Simplify.handleAndroidPayResult(requestCode, resultCode, data)) {
        return ;
    }
    super.onActivityResult(requestCode, resultCode, data);
}