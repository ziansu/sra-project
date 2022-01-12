@java.lang.Override
public void run() {
    super.run();
    boolean activo = true;
    while (activo) {
        if (miCliente.isClosed()) {
            activo = false;
            continue;
        }else {
            try {
                java.lang.String mensaje = entradaDeCliente.readLine();
                java.lang.System.out.println(("Mensaje del cliente > " + mensaje));
                miServer.enviarMensajeATodos(mensaje);
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
        }
    } 
}