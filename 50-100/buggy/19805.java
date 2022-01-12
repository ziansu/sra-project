public void scan(org.json.JSONArray args) {
    android.content.Intent intentScan = new android.content.Intent(com.honeywell.scanintent.ScanIntent.SCAN_ACTION);
    intentScan.addCategory(Intent.CATEGORY_DEFAULT);
    intentScan.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    intentScan.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);
    int loadmode = 0;
    intentScan.putExtra("scan_mode", ScanIntent.SCAN_MODE_RESULT_AS_URI);
    this.cordova.startActivityForResult(((org.apache.cordova.CordovaPlugin) (this)), intentScan, 5);
}