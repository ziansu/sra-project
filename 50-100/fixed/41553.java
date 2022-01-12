@java.lang.Override
public void run() {
    super.run();
    com.eva.me.server.ClientProcessThread.log("\nNew Client Request Process Thread create.....\n\n");
    processClientInfo();
    com.eva.me.server.ClientProcessThread.log("\nNew Client Request Process Complete.....\n\n");
    try {
        inputStream.close();
        outputStream.close();
        clientSocket.close();
    } catch (java.io.IOException e) {
        java.lang.System.out.println("Stream.. close .. error...");
        e.printStackTrace();
    }
}