private void solicitarConexion() throws java.io.IOException {
    PaqueteVecino paqueteParaEnviar = new PaqueteVecino(Paquete_t.SOLICITUD_DE_CONEXION, Router.ipLocal, Router.mascaraLocal, Router.numASLocal);
    output.write(paqueteParaEnviar.getBytes());
    s.setSoTimeout(5000);
    byte[] respuesta = new byte[11];
    input.read(respuesta);
    s.setSoTimeout(0);
    PaqueteVecino pv = new PaqueteVecino(Paquete_t.CONEXION_ACEPTADA, java.util.Arrays.copyOfRange(respuesta, 1, 11));
    vecinos.addVecino(pv, true);
}