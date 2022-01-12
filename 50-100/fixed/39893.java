public com.losameos.viverbot.Model.TuplaAltura BuscarTupla(int d) {
    for (int i = 0; i < (historial.size()); i++) {
        if ((historial.get(i).getDiaDeVida()) == d) {
            return historial.get(i);
        }
    }
    return null;
}