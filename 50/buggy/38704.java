private void showDialog() {
    java.lang.String psd = site.yanhui.mobilesafe.utils.SpUtils.getString(this, ConstantValue.MOBILE_SAFE_PSD, "");
    if (android.text.TextUtils.isEmpty(psd)) {
        showSetPsdDialog();
    }else {
        showConfirmPsdDialog();
    }
}