@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if ((resultCode == (RESULT_OK)) && (requestCode == (com.soctec.soctec.core.MainActivity.REQUEST_CODE))) {
        java.lang.String scannedCode = data.getExtras().getString("result");
        com.soctec.soctec.network.NetworkHandler.getInstance(this).sendScanInfoToPeer(scannedCode);
    }
}