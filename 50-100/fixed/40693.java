@java.lang.Override
public void run() {
    try {
        serverSocket = new java.net.ServerSocket(de.jamsk.mrxserver.MainActivity.SocketServerThread.SocketServerPORT);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    while (true) {
        try {
            java.net.Socket socket = serverSocket.accept();
            socketServerReplyThread = new de.jamsk.mrxserver.MainActivity.SocketServerReplyThread(socket);
            socketServerReplyThread.run();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    } 
}