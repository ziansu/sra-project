public void ShareData(java.lang.String content, java.lang.String title) {
    android.content.Intent i = new android.content.Intent();
    i.setAction(Intent.ACTION_SEND);
    i.putExtra(Intent.EXTRA_TEXT, ((title + "\n") + content));
    i.setType("text/plain");
    startActivity(android.content.Intent.createChooser(i, "Choose App to Share"));
}