public void tomarPeriodo(java.util.Date desde, java.util.Date hasta) {
    java.lang.System.out.println((((desde.toString()) + " - ") + (hasta.toString())));
    if (validarPeriodo(desde, hasta)) {
        this.desde = desde;
        this.hasta = hasta;
        fechaActual = obtenerFechaActual();
        categorias = buscarCategorias();
        pantalla.solicitarSeleccionCategorias(categorias);
    }else {
    }
}