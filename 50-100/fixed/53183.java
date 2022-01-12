public com.google.android.gms.maps.model.LatLng pegaCoordenadasPorEndereco(java.lang.String endereco) throws java.io.IOException {
    if (endereco.isEmpty()) {
        return null;
    }
    android.location.Geocoder geo = new android.location.Geocoder(this);
    java.util.List<android.location.Address> listaEnderecos = geo.getFromLocationName(endereco, 1);
    com.google.android.gms.maps.model.LatLng latLng = new com.google.android.gms.maps.model.LatLng(listaEnderecos.get(0).getLatitude(), listaEnderecos.get(0).getLongitude());
    return latLng;
}