@java.lang.Override
public void onPoiClick(com.google.android.gms.maps.model.PointOfInterest pointOfInterest) {
    android.widget.Toast.makeText(mContext, pointOfInterest.name, Toast.LENGTH_SHORT).show();
}