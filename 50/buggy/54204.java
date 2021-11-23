private void stopSensingTask() {
    if (!(dispatcher.isStopped()))
        dispatcher.stop();
    
}