public void run() {
    int stopRecording = -1;
    while (stopRecording != (javax.swing.JOptionPane.YES_OPTION)) {
        stopRecording = javax.swing.JOptionPane.showConfirmDialog(null, "Do you want to stop recording?", "Status", javax.swing.JOptionPane.YES_NO_OPTION);
        if (stopRecording == (javax.swing.JOptionPane.YES_OPTION)) {
            stopRecording();
        }
    } 
    if (java.lang.Thread.currentThread().isInterrupted()) {
        java.lang.System.out.println("Recording Thread interrupted\n Exiting...");
    }
}