public void share(java.lang.String string) {
    android.content.Intent sendIntent = new android.content.Intent();
    sendIntent.setAction(Intent.ACTION_SEND);
    sendIntent.putExtra(Intent.EXTRA_TEXT, string);
    sendIntent.setType("text/plain");
    startActivity(android.content.Intent.createChooser(sendIntent, getResources().getText(R.string.send_to)));
}