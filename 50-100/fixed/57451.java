protected void callToMap() {
    android.net.Uri gmmIntentUri = android.net.Uri.parse(("google.navigation:q=" + (mAddress)));
    android.content.Intent mapIntent = new android.content.Intent(android.content.Intent.ACTION_VIEW, gmmIntentUri);
    mapIntent.setPackage("com.google.android.apps.maps");
    startActivity(mapIntent);
    finish();
}