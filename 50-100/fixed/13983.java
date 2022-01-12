public void tomarPeriodo(java.util.Date desde, java.util.Date hasta) {
    fechaActual = obtenerFechaActual();
    if (validarPeriodo(desde, hasta)) {
        this.desde = desde;
        this.hasta = hasta;
        categorias = buscarCategorias();
        pantalla.solicitarSeleccionCategorias(categorias);
    }else {
    }
}