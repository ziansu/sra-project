public void onClick(android.view.View v) {
    if ((selectedPreviewImageIndex) > 0) {
        (selectedPreviewImageIndex)--;
    }
    android.widget.ImageView imgViewer = ((android.widget.ImageView) (findViewById(R.id.image_preview)));
    android.graphics.Bitmap selectedImage = android.graphics.BitmapFactory.decodeFile(previewImageList[selectedPreviewImageIndex].getAbsolutePath());
    imgViewer.setImageBitmap(selectedImage);
    frameMatcher.setTemplate(selectedImage);
}