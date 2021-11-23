public void saveButtonClicked(android.view.View view) {
    java.lang.String filename = java.text.SimpleDateFormat.getDateInstance().toString();
    android.graphics.Bitmap bitmap = m_canvasView.getBitmap();
    MediaStore.Images.Media.insertImage(getContentResolver(), bitmap, filename, "Colored Donut Drawing");
    android.widget.Toast.makeText(this, "Image saved to gallery", Toast.LENGTH_SHORT).show();
}