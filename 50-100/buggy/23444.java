@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if ((data == null) || (!(data.hasExtra(GoogleLoginActivity.EXTRA_CODE)))) {
        showToast(R.string.AUTH_FAILED);
        return ;
    }
    java.lang.String code = data.getStringExtra(GoogleLoginActivity.EXTRA_CODE);
    com.pokescanner.loaders.AuthGOOGLELoader authGOOGLELoader = new com.pokescanner.loaders.AuthGOOGLELoader(code);
    authGOOGLELoader.start();
}