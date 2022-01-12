@java.lang.Override
public void run() {
    try {
        while (serverOverseer.isRunning) {
            com.kubasz561.roulette.common.JSONMessage msg = ((com.kubasz561.roulette.common.JSONMessage) (clientToServer.readObject()));
            this.clientCommunicationSemaphore.acquireUninterruptibly();
            serverOverseer.gameLogicMutex.acquireUninterruptibly();
            serverOverseer.serverGameLogic.handleMessage(msg, thisThreadsClient);
            serverOverseer.gameLogicMutex.release();
            this.clientCommunicationSemaphore.release();
        } 
    } catch (java.io.IOException | java.lang.ClassNotFoundException e) {
        e.printStackTrace();
    } finally {
        communicationManagerServer.closeAll();
    }
}