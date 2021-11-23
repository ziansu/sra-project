@java.lang.Override
public boolean esCercano(final ar.edu.utn.frba.dds.model.poi.Geolocalizacion geolocalizacion) {
    if ((this.geolocalizacion) == null)
        return false;
    else
        return (this.getGeolocalizacion().calcularDistanciaEnCuadras(geolocalizacion)) < (this.getRubro().obtenerRadioCercania());
    
}