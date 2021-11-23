private void start() {
    neighbors = new int[rows][cols];
    history = new java.util.ArrayList<>();
    grid = new int[rows][cols];
    show();
    playTimer = new javax.swing.Timer(500, new java.awt.event.ActionListener() {
        @java.lang.Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            play();
        }
    });
    playTimer.start();
}