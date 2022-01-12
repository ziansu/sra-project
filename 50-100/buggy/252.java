@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    m_CurrentLocation = location;
    m_CurrentLatLng = new com.google.android.gms.maps.model.LatLng(m_CurrentLocation.getLatitude(), m_CurrentLocation.getLongitude());
    m_LastUpdateTime = java.text.DateFormat.getTimeInstance().format(new java.util.Date());
    if (!(m_CameraCentered)) {
        m_Maps.centerCamera(m_CurrentLatLng);
        m_CameraCentered = true;
    }
}