public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (com.firebase.ui.auth.ui.AcquireEmailHelper.REQUEST_CODES.contains(requestCode)) {
        mActivityHelper.finish(resultCode, new android.content.Intent());
    }
}