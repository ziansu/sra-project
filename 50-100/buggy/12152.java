private void callAttempt(java.lang.String sitePhoneNumber, java.lang.String callingSiteToastText) {
    android.content.Intent callIntent = new android.content.Intent(android.content.Intent.ACTION_CALL);
    try {
        callIntent.setData(android.net.Uri.parse("tel:8122387631"));
        startActivity(callIntent);
        android.widget.Toast.makeText(getApplicationContext(), callingSiteToastText, Toast.LENGTH_SHORT).show();
    } catch (java.lang.SecurityException ex) {
        java.lang.String noPermToastText = getResources().getString(R.string.toast_call_perm);
        android.widget.Toast.makeText(getApplicationContext(), noPermToastText, Toast.LENGTH_SHORT).show();
    }
    callDialog.dismiss();
}