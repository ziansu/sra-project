private void playMusicTest() {
    android.content.Intent intent = new android.content.Intent();
    intent.setAction(Intent.ACTION_VIEW);
    java.io.File file = new java.io.File((((android.os.Environment.getExternalStorageDirectory().getPath()) + "/Music/") + "1. Bitter Heart.mp3"));
    intent.setDataAndType(android.net.Uri.fromFile(file), "audio/*");
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    startActivity(intent);
}