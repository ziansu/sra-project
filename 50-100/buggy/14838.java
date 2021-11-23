private void ejecutar() {
    byte[] datoSocket = new byte[maxLenght];
    while (!(exit)) {
        try {
            java.net.DatagramPacket paquete = new java.net.DatagramPacket(datoSocket, datoSocket.length);
            conexion.receive(paquete);
            guardarMensaje(paquete);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    } 
}