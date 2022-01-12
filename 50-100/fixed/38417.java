private boolean isDeviceDataAvailable() {
    if (primeDao.isAllDataEmpty()) {
        state = com.rainbow.kam.bt_scanner.activity.prime.PrimeActivity.connectionStateType.NEED_DEVICE_NOT_CONNECT;
        showDeviceSettingSnackBar();
        dismissSwipeRefresh();
        primeFragment.setValueEmpty();
        return false;
    }else
        if (!(primeDao.isUserDataAvailable())) {
            state = com.rainbow.kam.bt_scanner.activity.prime.PrimeActivity.connectionStateType.NEED_USER_CONNECT;
        }
    
    return true;
}