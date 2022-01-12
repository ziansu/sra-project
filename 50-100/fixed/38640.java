public void run() {
    stopRecording = javax.swing.JOptionPane.showConfirmDialog(null, "Do you want to stop recording?", "Status", javax.swing.JOptionPane.YES_NO_OPTION);
    while ((stopRecording) != (javax.swing.JOptionPane.YES_OPTION)) {
        if ((stopRecording) == (javax.swing.JOptionPane.YES_OPTION)) {
            stopRecording();
        }
        stopRecording = javax.swing.JOptionPane.showConfirmDialog(null, "Do you want to stop recording?", "Status", javax.swing.JOptionPane.YES_NO_OPTION);
    } 
    if (java.lang.Thread.currentThread().isInterrupted()) {
        java.lang.System.out.println("Recording Thread interrupted\n Exiting...");
    }
}