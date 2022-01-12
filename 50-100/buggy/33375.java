@java.lang.Override
public void end(org.jdesktop.core.animation.timing.Animator source) {
    remove(currentToast);
    currentToast = null;
    new javax.swing.Timer(1000, new java.awt.event.ActionListener() {
        @java.lang.Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            animationRunning = false;
            displayNextToast();
        }
    }).start();
}