public static com.uy.antel.controlador.ctrlCentral getInstance() {
    if ((com.uy.antel.controlador.ctrlCentral.instance) == null) {
        com.uy.antel.controlador.ctrlCentral.instance = new com.uy.antel.controlador.ctrlCentral();
    }
    return com.uy.antel.controlador.ctrlCentral.instance;
}