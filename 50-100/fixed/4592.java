@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((e.getSource()) == (btnStart)) {
        audioThread.start();
        btnStop.setEnabled(true);
        btnStart.setEnabled(false);
    }else
        if ((e.getSource()) == (btnStop)) {
            audioThread.interrupt();
            btnStart.setEnabled(true);
            btnStop.setEnabled(false);
        }
    
}