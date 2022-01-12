@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    shareIntent.putExtra(Intent.EXTRA_TEXT, s.toString());
    share.setShareIntent(shareIntent);
}