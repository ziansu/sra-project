@java.lang.Override
protected void onPostExecute(android.graphics.Bitmap bitmap) {
    super.onPostExecute(bitmap);
    if (bitmap != null) {
        image.setBackgroundColor(getResources().getColor(android.R.color.transparent));
        image.setImageBitmap(bitmap);
        et.setWidth(80);
        et.setText("");
    }else {
        android.util.Log.i(MY_LOG, "bitmap null");
        android.widget.Toast.makeText(this, "Sorry, not a picture", Toast.LENGTH_LONG).show();
    }
}