@java.lang.Override
public boolean stop() {
    java.lang.System.out.println("Platform stopped");
    try {
        clientThread.join();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
        return false;
    } finally {
        client.close();
    }
    return true;
}