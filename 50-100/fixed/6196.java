@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent sharingIntent = new android.content.Intent(android.content.Intent.ACTION_SEND);
    sharingIntent.setType("text/plain");
    java.lang.String shareLink = scriptureData.getLink();
    sharingIntent.putExtra(Intent.EXTRA_TEXT, shareLink);
    startActivity(android.content.Intent.createChooser(sharingIntent, "Share via"));
}