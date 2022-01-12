private void processImage(android.graphics.Bitmap savePic, java.lang.String title) {
    java.io.File dir = mDomoticz.saveSnapShot(savePic, title);
    if (dir != null) {
        android.content.Intent intent = new android.content.Intent(getActivity(), nl.hnogames.domoticz.CameraActivity.class);
        intent.putExtra("IMAGETITLE", title);
        intent.putExtra("IMAGEURL", dir.getPath());
        startActivity(intent);
    }
}