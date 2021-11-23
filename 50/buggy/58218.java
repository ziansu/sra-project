public void startTimer() {
    remainingTime = 300000;
    javax.swing.Timer timer = new javax.swing.Timer(1000, new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
            remainingTime -= 1000;
            repaint();
        }
    });
    timer.start();
}