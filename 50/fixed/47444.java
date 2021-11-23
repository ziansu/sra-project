@java.lang.Override
public void setIcon(android.graphics.Bitmap icon) {
    if (icon != null) {
        marker.setIcon(com.google.android.gms.maps.model.BitmapDescriptorFactory.fromBitmap(icon));
    }
}