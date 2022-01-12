public void actionPerformed(java.awt.event.ActionEvent ex) {
    bottomInner.remove(startButton);
    bottomInner.revalidate();
    bottomInner.repaint();
    new java.lang.Thread(new java.lang.Runnable() {
        public void run() {
            startGame();
        }
    }).start();
    java.lang.System.out.println("Thread test");
}