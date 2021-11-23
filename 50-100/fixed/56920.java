public void onClick(android.view.View v) {
    if ((previewImageList) == null) {
        return ;
    }
    if ((selectedPreviewImageIndex) < (previewImageList.length)) {
        (selectedPreviewImageIndex)++;
    }
    android.widget.ImageView imgViewer = ((android.widget.ImageView) (findViewById(R.id.image_preview)));
    android.graphics.Bitmap selectedImage = android.graphics.BitmapFactory.decodeFile(previewImageList[selectedPreviewImageIndex].getAbsolutePath());
    imgViewer.setImageBitmap(selectedImage);
    frameMatcher.setTemplate(previewImageList[selectedPreviewImageIndex].getAbsolutePath());
}