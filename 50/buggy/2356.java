@java.lang.Override
public void onMapLongClick(final com.google.android.gms.maps.model.LatLng point) {
    android.widget.Toast.makeText(mContext, ("Long Press" + (point.toString())), Toast.LENGTH_LONG).show();
}