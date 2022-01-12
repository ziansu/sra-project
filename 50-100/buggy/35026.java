public android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent) {
    android.widget.ImageView imageView;
    if (convertView == null) {
        imageView = new android.widget.ImageView(mContext);
        imageView.setLayoutParams(new android.widget.GridView.LayoutParams(85, 85));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(8, 8, 8, 8);
    }else {
        imageView = ((android.widget.ImageView) (convertView));
    }
    imageView.setImageBitmap(com.hackharvard.smartmusicshuffle.ImageAdapter.thumbnails.get(position));
    return imageView;
}