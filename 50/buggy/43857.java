private void loadTraceFile(java.io.File file) {
    if ((fConfigFile) != null)
        saveConfig();
    
    javax.swing.ProgressMonitor monitor = new javax.swing.ProgressMonitor(this, "Loading...", "", 0, 100);
    new WaveApp.TraceLoadWorker(file, monitor).execute();
}