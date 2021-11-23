public void end() {
    endOutputStreamMonitoring();
    resultReader.stop();
    try {
        resultReaderThread.join();
    } catch (java.lang.InterruptedException e) {
        com.piece_framework.makegood.launch.Activator.getDefault().getLog().log(new org.eclipse.core.runtime.Status(org.eclipse.core.runtime.Status.WARNING, Activator.PLUGIN_ID, e.getMessage(), e));
    }
    progress.end();
    endTime = new java.util.Date();
}