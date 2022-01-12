@java.lang.Override
public void run() {
    try {
        socket = new java.net.Socket(host, puerto);
        java.lang.System.out.println(("Conectado a: " + (socket.toString())));
        AgregarSocket(socket);
        readData(socket);
    } catch (java.net.UnknownHostException ue) {
    } catch (java.io.IOException ie) {
    }
}