protected void callToMap(android.view.View v) {
    try {
        android.net.Uri gmmIntentUri = android.net.Uri.parse(("google.navigation:q=" + (mAddress)));
        android.content.Intent mapIntent = new android.content.Intent(android.content.Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
        finish();
    } catch (java.lang.Exception e) {
        createAlertDialog("Call to map", ("" + (e.toString())));
    }
}