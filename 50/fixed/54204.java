private synchronized void stopSensingTask() {
    if (!(dispatcher.isStopped()))
        dispatcher.stop();
    
    dispatcher = null;
}