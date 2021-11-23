@java.lang.Override
protected void onPostExecute(com.andreadec.musicplayer.Bitmap image) {
    if (image != null) {
        imageView.setImageBitmap(image);
        imageView.setVisibility(View.VISIBLE);
    }else {
        imageView.setImageDrawable(null);
    }
}