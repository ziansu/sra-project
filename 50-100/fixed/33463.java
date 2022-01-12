private android.widget.ImageView placeMarker(int resId, double x, double y) {
    android.widget.ImageView imageView = new android.widget.ImageView(this);
    imageView.setImageResource(resId);
    getTileView().addMarker(imageView, x, y, null, null);
    return imageView;
}