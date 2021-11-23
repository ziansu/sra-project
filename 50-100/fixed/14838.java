private void ejecutar() {
    while (!(exit)) {
        try {
            byte[] datoSocket = new byte[maxLenght];
            java.net.DatagramPacket paquete = new java.net.DatagramPacket(datoSocket, datoSocket.length);
            conexion.receive(paquete);
            guardarMensaje(paquete);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    } 
}