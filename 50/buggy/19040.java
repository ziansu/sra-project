@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    java.lang.System.out.println("ConfirmationActivity : onActivityResult");
    if (com.simplify.android.sdk.Simplify.handleAndroidPayResult(requestCode, resultCode, data)) {
        return ;
    }
    super.onActivityResult(requestCode, resultCode, data);
}