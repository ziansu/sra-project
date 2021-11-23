private void getCurWifiInfo() {
    if (!(isWifiContect())) {
        com.umarbhutta.xlightcompanion.Tools.ToastUtil.showToast(this, getString(R.string.please_open_wifi));
        return ;
    }
    getWifiList();
}