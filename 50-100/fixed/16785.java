public void onJarResponse(com.skynetcomputing.skynetserver.Worker worker, boolean isOK) {
    if (!isOK) {
        try {
            java.io.File jarFile = persistMgr.getJarFile(worker.getCurrentTask().getJobID());
            connection.sendMessage(worker, TaskMessage.SENDING_JAR);
            connection.sendFile(worker, jarFile);
        } catch (java.io.IOException ex) {
            java.util.logging.Logger.getLogger(com.skynetcomputing.skynetserver.WorkerManager.class.getName()).log(java.util.logging.Level.SEVERE, "Failed sending jar", ex);
        }
    }
}