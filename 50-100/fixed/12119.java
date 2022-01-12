@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    simController.startRunning();
    if ((guiRunTimer) == null) {
        guiRunTimer = new javax.swing.Timer(15, new java.awt.event.ActionListener() {
            @java.lang.Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if (simController.isRunning())
                    simController.tick();
                
            }
        });
        guiRunTimer.setRepeats(true);
        guiRunTimer.start();
    }
}