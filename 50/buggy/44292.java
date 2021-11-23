public boolean esCercano(final ar.edu.utn.frba.dds.model.poi.Geolocalizacion geolocalizacion) {
    return (this.getGeolocalizacion().calcularDistanciaEnCuadras(geolocalizacion)) < 5;
}