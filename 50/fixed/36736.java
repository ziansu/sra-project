public static final com.google.android.gms.maps.model.MarkerOptions PersonToMarkerOption(net.hokiegeek.android.dondeestas.data.Person p) {
    return new com.google.android.gms.maps.model.MarkerOptions().position(net.hokiegeek.android.dondeestas.Util.PositionToLatLng(p.getPosition())).title(p.getName());
}