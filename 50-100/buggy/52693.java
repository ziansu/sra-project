private void loadPhoto(java.lang.String url, android.widget.ImageView imageView, int imageHeight, int imageWidth) {
    picasso.load(url).noFade().resize((imageHeight / 2), (imageWidth / 2)).error(R.drawable.placeholder).into(imageView);
}