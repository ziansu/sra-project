private void setPic() {
    mGPUImageView.setImage(android.net.Uri.fromFile(photoFile));
    mGPUImageView.setScaleType(GPUImage.ScaleType.CENTER_INSIDE);
    mGPUImageView.setFilter(filter);
    java.lang.String timeStamp = new java.text.SimpleDateFormat("yyyyMMdd_HHmmss").format(new java.util.Date());
    java.lang.String imageFileName = ("JPEG_" + timeStamp) + "_green.jpg";
    mGPUImageView.saveToPictures("GreenUniversity", imageFileName, this);
    setShareActionProvider();
}