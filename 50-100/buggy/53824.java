private void sendShare() {
    android.content.Intent shareIntent = new android.content.Intent();
    shareIntent.setAction(Intent.ACTION_SEND);
    shareIntent.putExtra(Intent.EXTRA_SUBJECT, R.string.share_subject);
    shareIntent.putExtra(Intent.EXTRA_TEXT, java.lang.String.format(getResources().getString(R.string.share_content), mCallCount));
    shareIntent.setType("text/plain");
    startActivity(android.content.Intent.createChooser(shareIntent, getResources().getString(R.string.share_chooser_title)));
}