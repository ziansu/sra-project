public int compare(ar.com.textillevel.entidades.ventas.cotizacion.VersionListaDePrecios o1, ar.com.textillevel.entidades.ventas.cotizacion.VersionListaDePrecios o2) {
    int compFecha = o1.getInicioValidez().compareTo(o2.getInicioValidez());
    return (-1) * (((compFecha == 0) && ((o1.getId()) != null)) && ((o2.getId()) != null) ? o1.getId().compareTo(o2.getId()) : compFecha);
}