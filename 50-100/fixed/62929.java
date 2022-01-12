public void deleteImage(android.view.View view) {
    imageURI = null;
    delete = true;
    android.widget.Button ib = ((android.widget.Button) (findViewById(R.id.buttonAddImage)));
    ib.setBackgroundResource(android.R.drawable.btn_default);
    ib.setText("Add Image");
    android.widget.Toast.makeText(this, "Photo Deleted", Toast.LENGTH_SHORT).show();
}