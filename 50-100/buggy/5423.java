private void returnToMain() {
    if ((isFinishing()) || (((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.JELLY_BEAN_MR1)) && (isDestroyed()))) {
        return ;
    }
    if (allowsHomeUp) {
        onBackPressed();
    }else {
        android.content.Intent intent = new android.content.Intent(this, org.a5calls.android.a5calls.controller.MainActivity.class);
        startActivity(intent);
        finish();
    }
}