private void loadShareProvider(java.lang.String title) {
    android.content.Intent shareIntent = new android.content.Intent(android.content.Intent.ACTION_SEND);
    shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);
    shareIntent.setType("text/plain");
    shareIntent.putExtra(Intent.EXTRA_TEXT, ((getString(R.string.share_text)) + title));
    shareActionProvider.setShareIntent(shareIntent);
}