@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if ((requestCode == (com.ww23.l_band.ListenActivity.REQUEST_ENABLE_BT)) && (resultCode == (android.app.Activity.RESULT_CANCELED))) {
        toast(getString(R.string.deny_open_bluetooth));
        finish();
        return ;
    }
    super.onActivityResult(requestCode, resultCode, data);
}