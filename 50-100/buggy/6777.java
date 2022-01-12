public void init() {
    registerService();
    evalThread.start();
    wifiReceiver.start();
    addToQueue(bluetoothRestart);
    addToQueue(nearbyPeersChecker);
    addToQueue(nearbyPeersChecker);
    synchronized(evalThread) {
        evalThread.notify();
    }
    blockedWorkersChecker.run();
}