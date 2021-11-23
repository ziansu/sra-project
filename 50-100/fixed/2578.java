@java.lang.Override
protected java.lang.Object doInBackground() throws java.lang.Exception {
    getContentPane().add(player);
    getContentPane().revalidate();
    getContentPane().requestFocus();
    while (true) {
        player.moveTick();
        repaint();
        player.isOffscreen(xSize, ySize);
        try {
            java.lang.Thread.sleep(20);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
}