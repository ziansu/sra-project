@java.lang.Override
public void openShareDialog(@android.support.annotation.NonNull
java.lang.String text) {
    android.content.Intent shareIntent = new android.content.Intent(android.content.Intent.ACTION_SEND);
    shareIntent.setType("text/plain");
    shareIntent.putExtra(Intent.EXTRA_TITLE, getString(R.string.lib_app_name));
    shareIntent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.lib_app_name));
    shareIntent.putExtra(Intent.EXTRA_TEXT, text);
    startActivity(android.content.Intent.createChooser(shareIntent, null));
}