@java.lang.Override
public void onLoadingComplete(java.lang.String imageUri, android.view.View view, android.graphics.Bitmap loadedImage) {
    super.onLoadingComplete(imageUri, view, loadedImage);
    urlDrawable.bitmap = loadedImage;
    urlDrawable.setBounds(0, 0, loadedImage.getWidth(), loadedImage.getHeight());
    textView.invalidate();
    textView.setText(textView.getText());
}