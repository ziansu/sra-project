public com.losameos.viverbot.Model.TuplaAltura BuscarTupla(java.util.Date d) {
    for (int i = 0; i < (historial.size()); i++) {
        if (historial.get(i).getDiaDeVida().equals(d)) {
            return historial.get(i);
        }
    }
    return null;
}