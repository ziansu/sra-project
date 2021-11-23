private org.mapsforge.map.layer.overlay.Marker createMarker(org.mapsforge.core.model.LatLong p, int resource) {
    android.graphics.drawable.Drawable drawable = getResources().getDrawable(resource);
    org.mapsforge.core.graphics.Bitmap bitmap = org.mapsforge.map.android.graphics.AndroidGraphicFactory.convertToBitmap(drawable);
    return new org.mapsforge.map.layer.overlay.Marker(p, bitmap, 0, ((-(bitmap.getHeight())) / 2));
}