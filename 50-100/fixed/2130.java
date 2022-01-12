public void composeMessage(java.lang.String name, java.lang.String address) {
    android.content.Intent mIntent = new android.content.Intent(android.content.Intent.ACTION_SEND);
    mIntent.setType("text/plain");
    if ((name != null) && (address != null)) {
        java.lang.String message = (name + " ") + address;
        mIntent.putExtra(Intent.EXTRA_TEXT, message);
    }
    if ((mShareActionProvider) != null) {
        mShareActionProvider.setShareIntent(mIntent);
    }
}