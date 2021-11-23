public void solicitarCorreccionTrayectoria(int robotID, int Dirección, java.awt.Point Posicion) {
    enviarSMS(Networking.base.GestionDeMensajes.SolicitarCorreccionTrayectoria(robotID, Dirección, Posicion));
}