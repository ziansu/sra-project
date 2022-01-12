private void solicitarConexion() throws java.io.IOException {
    PaqueteVecino paqueteParaEnviar = new PaqueteVecino(Paquete_t.SOLICITUD_DE_CONEXION, Router.ipLocal, Router.mascaraLocal, Router.numASLocal);
    output.write(paqueteParaEnviar.getBytes());
    byte[] respuesta = new byte[11];
    input.read(respuesta);
    PaqueteVecino pv = new PaqueteVecino(Paquete_t.CONEXION_ACEPTADA, java.util.Arrays.copyOfRange(respuesta, 1, 11));
    vecinos.addVecino(pv, true);
}