@java.lang.Override
public void onGpsStatusChanged(int event) {
    switch (event) {
        case android.location.GpsStatus.GPS_EVENT_SATELLITE_STATUS :
            updateGpsInfo();
            break;
        case android.location.GpsStatus.GPS_EVENT_FIRST_FIX :
            android.widget.ImageView imageView = ((android.widget.ImageView) (getView().findViewById(R.id.image_view_gps)));
            assert imageView != null;
            imageView.setImageResource(R.drawable.ic_gps_fixed_24dp);
            break;
    }
}