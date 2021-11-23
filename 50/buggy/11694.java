private void addMessageListenerTimer() {
    msgListenerTimer = new javax.swing.Timer(msgSpeed, new java.awt.event.ActionListener() {
        @java.lang.Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            runMessageListener();
        }
    });
    msgListenerTimer.setInitialDelay(msgPause);
    msgListenerTimer.start();
}