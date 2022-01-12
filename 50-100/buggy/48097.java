public java.lang.String showPelicula(int dia, int mes, int anyo) {
    java.lang.String aux = "";
    java.util.Date vFecha = new java.util.Date();
    vFecha = getFecha(dia, mes, anyo);
    for (m3.p01.Sala i : listaSalas) {
        if (FechaIgual(i.devolverSesion(vFecha).getDate(), vFecha)) {
            aux = i.devolverSesion(vFecha).getPelicula().toString();
        }
    }
    return aux;
}