@java.lang.Override
public boolean comprobarSiSolicitudFirmada(models.SolicitudFirmaPortafirma solicitudFirmaPortafirma) throws services.PortafirmaFapServiceException {
    java.lang.String estadoSolicitudFirma = obtenerEstadoFirma(solicitudFirmaPortafirma);
    if ((EstadoSolicitudEnumType.FIRMADA.value().equalsIgnoreCase(estadoSolicitudFirma)) || (EstadoSolicitudEnumType.FIRMADA_Y_REENVIADA.value().equalsIgnoreCase(estadoSolicitudFirma))) {
        play.Logger.info((("La solicitud de firma de portafirma " + (solicitudFirmaPortafirma.uriSolicitud)) + " ha sido firmada."));
        return true;
    }else {
        play.Logger.info((("La solicitud de firma de portafirma " + (solicitudFirmaPortafirma.uriSolicitud)) + " no ha sido firmada y finalizada."));
        return false;
    }
}