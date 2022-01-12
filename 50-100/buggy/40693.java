@java.lang.Override
public void run() {
    try {
        serverSocket = new java.net.ServerSocket(de.jamsk.mrxserver.MainActivity.SocketServerThread.SocketServerPORT);
        while (true) {
            java.net.Socket socket = serverSocket.accept();
            de.jamsk.mrxserver.MainActivity.SocketServerReplyThread socketServerReplyThread = new de.jamsk.mrxserver.MainActivity.SocketServerReplyThread(socket);
            socketServerReplyThread.run();
        } 
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}