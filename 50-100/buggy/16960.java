public void share(java.lang.String string) {
    android.content.Intent intent = getIntent();
    java.lang.String message = intent.getStringExtra(string);
    android.content.Intent sendIntent = new android.content.Intent();
    sendIntent.setAction(Intent.ACTION_SEND);
    sendIntent.putExtra(Intent.EXTRA_TEXT, message);
    sendIntent.setType("text/plain");
    startActivity(android.content.Intent.createChooser(sendIntent, getResources().getText(R.string.send_to)));
}