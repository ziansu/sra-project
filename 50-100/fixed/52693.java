private void loadPhoto(java.lang.String url, android.widget.ImageView imageView, int imageHeight, int imageWidth) {
    if ((imageWidth != 0) && (imageHeight != 0)) {
        picasso.load(url).noFade().resize((imageHeight / 2), (imageWidth / 2)).error(R.drawable.placeholder).into(imageView);
    }else {
        picasso.load(url).noFade().error(R.drawable.placeholder).into(imageView);
    }
}