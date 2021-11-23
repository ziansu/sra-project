private void cancelAllForward() {
    java.lang.String disableAllForwardString = "#21#";
    android.content.Intent intentCallForward = new android.content.Intent(android.content.Intent.ACTION_CALL);
    android.net.Uri uri = android.net.Uri.fromParts("tel", disableAllForwardString, "");
    intentCallForward.setData(uri);
    startActivity(intentCallForward);
}