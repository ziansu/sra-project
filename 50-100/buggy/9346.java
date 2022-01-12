public void imageClick(android.view.View view) {
    android.widget.Toast.makeText(getApplicationContext(), "click on image", Toast.LENGTH_SHORT).show();
    android.support.v7.app.AlertDialog.Builder builder = new android.support.v7.app.AlertDialog.Builder(this);
    builder.setTitle("");
    android.widget.ImageView imageView = new android.widget.ImageView(getApplicationContext());
    imageView.setImageBitmap(origImage);
    builder.setView(imageView);
    builder.show();
}