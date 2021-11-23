@java.lang.Override
public boolean esCercano(final ar.edu.utn.frba.dds.model.poi.Geolocalizacion geolocalizacion) {
    return (this.getGeolocalizacion().calcularDistanciaEnCuadras(geolocalizacion)) < (this.getRubro().obtenerRadioCercania());
}