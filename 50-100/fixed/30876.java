@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent videoShareIntent = new android.content.Intent(android.content.Intent.ACTION_SEND);
    videoShareIntent.setType("video/*");
    videoShareIntent.putExtra(Intent.EXTRA_STREAM, videoUris.get(position).getVideoUri());
    context.startActivity(android.content.Intent.createChooser(videoShareIntent, "select medium"));
}