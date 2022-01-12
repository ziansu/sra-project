public void fakeBtnFb() {
    playSound(R.raw.touch_sound);
    if ((com.oic.game.ailatrieuphu.util.NetworkUtils.checkInternetConnection(this)) && (mSocketAltp.isConnected())) {
        int permissionCheck = android.support.v4.content.ContextCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE);
        if (permissionCheck != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
            android.util.Log.e("TAG", "fakeBtnFb: get Permission");
            android.support.v4.app.ActivityCompat.requestPermissions(this, new java.lang.String[]{ Manifest.permission.READ_PHONE_STATE }, com.oic.game.ailatrieuphu.ui.activity.LoginScreen.REQUEST_READ_PHONE_STATE);
        }else {
            mLoginButtonFb.performClick();
        }
    }else {
        connectionDialog.show();
    }
}