public void ShareData(java.lang.String data) {
    android.content.Intent i = new android.content.Intent();
    i.setAction(Intent.ACTION_SEND);
    i.putExtra(Intent.EXTRA_TEXT, data);
    i.setType("text/plain");
    startActivity(android.content.Intent.createChooser(i, "Choose App to Share"));
}