private static void stopReceiverThread() {
    if ((com.sonycsl.echo.EchoSocket.udpThread) != null) {
        com.sonycsl.echo.EchoSocket.udpThread.interrupt();
        try {
            com.sonycsl.echo.EchoSocket.udpThread.join();
        } catch (java.lang.Exception e) {
        }
        com.sonycsl.echo.EchoSocket.udpThread = null;
    }
    if ((com.sonycsl.echo.EchoSocket.sTaskPerformerThread) != null) {
        com.sonycsl.echo.EchoSocket.fPerformActive = false;
        com.sonycsl.echo.EchoSocket.sTaskPerformerThread.interrupt();
        try {
            com.sonycsl.echo.EchoSocket.sTaskPerformerThread.join();
        } catch (java.lang.Exception e) {
        }
        com.sonycsl.echo.EchoSocket.sTaskPerformerThread = null;
    }
}