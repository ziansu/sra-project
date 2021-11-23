private boolean hasConnection() {
    boolean hasConnection = false;
    try {
        hasConnection = validarUsuario(USUARIOHIPERREG, encriptarPassword(PASSWORDHIPERREG));
        play.Logger.info(((("El servicio tiene conexion con " + (getEndPoint())) + "?: ") + hasConnection));
    } catch (java.lang.Exception e) {
        play.Logger.info(("El servicio no tiene conexion con " + (getEndPoint())));
    }
    return hasConnection;
}