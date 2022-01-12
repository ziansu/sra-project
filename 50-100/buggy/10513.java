public android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent) {
    android.widget.ImageView imageView = new android.widget.ImageView(context);
    android.graphics.Bitmap ThumbImage = android.media.ThumbnailUtils.extractThumbnail(android.graphics.BitmapFactory.decodeFile(imageIDs.get(position)), 100, 100);
    imageView.setImageBitmap(ThumbImage);
    imageView.setLayoutParams(new android.widget.Gallery.LayoutParams(200, 200));
    imageView.setBackgroundResource(itemBackground);
    return imageView;
}