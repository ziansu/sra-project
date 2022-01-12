public void run() {
    while (true) {
        try {
            socket = servidor.accept();
            AgregarSocket(socket);
            java.lang.System.out.println(("Nuevo cliente conectado: " + (java.lang.String.valueOf(socket))));
            readData(socket);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    } 
}