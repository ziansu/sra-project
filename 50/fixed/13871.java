public void scanNow(android.view.View v) {
    startActivityForResult(new android.content.Intent(getApplicationContext(), com.soctec.soctec.core.ScanActivity.class), com.soctec.soctec.core.MainActivity.REQUEST_CODE);
}