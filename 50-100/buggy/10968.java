private void copyId(java.lang.String id) {
    android.content.ClipboardManager clipboard = ((android.content.ClipboardManager) (getSystemService(Context.CLIPBOARD_SERVICE)));
    android.content.ClipData clip = android.content.ClipData.newPlainText("ID", id);
    clipboard.setPrimaryClip(clip);
    android.content.Context context = getApplicationContext();
    java.lang.CharSequence dialogText = "Object id copied to clipboard";
    int duration = android.widget.Toast.LENGTH_SHORT;
    android.widget.Toast.makeText(context, dialogText, duration).show();
}