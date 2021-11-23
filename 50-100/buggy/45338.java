@java.lang.Override
public void run() {
    try (java.net.Socket s = socket;java.io.InputStream is = socket.getInputStream();java.io.OutputStream os = socket.getOutputStream()) {
        for (int i = 0; (i = is.read()) != (-1);) {
            os.write(net.util.Magic.doMagic(i));
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    (net.blocking.SimpleBlockingServer.openConnections)--;
}