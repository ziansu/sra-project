private void displayMessages() {
    final java.lang.String bundledMessages = getPreference("log");
    if ((bundledMessages != "") && (bundledMessages != null)) {
        final android.content.Context context = this;
        android.content.Intent intent = new android.content.Intent(context, ojovoz.messagesActivity.class);
        startActivity(intent);
    }else {
        android.widget.Toast.makeText(this, R.string.omNoMessagesText, Toast.LENGTH_SHORT).show();
    }
}