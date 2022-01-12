@java.lang.Override
public void onClick(android.view.View v) {
    if ((ll) != null) {
        ll.removeAllViews();
        ll.refreshDrawableState();
    }
    android.net.Uri relativePath = android.net.Uri.fromFile(new java.io.File(((android.os.Environment.getExternalStorageDirectory()) + "/images.jpeg")));
    android.content.Intent cameraIntent = new android.content.Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
    cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, relativePath);
    startActivityForResult(cameraIntent, com.teamzenith.game.zpuzzle.controller.Game.CAMERA_REQUEST);
}