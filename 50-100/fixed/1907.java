@java.lang.Override
public void run() {
    try {
        server.basics.HttpRequest request = new server.basics.HttpRequest(clientSocket);
        writeLog(request);
        try {
            handleRequest(request);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } finally {
            clientSocket.close();
        }
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}