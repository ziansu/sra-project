public static void main(java.lang.String[] args) {
    javax.swing.JFrame frame = new javax.swing.JFrame();
    graphics.Screen screen = new graphics.Screen("Bob", true);
    frame.add(screen);
    frame.setUndecorated(true);
    frame.setSize(graphics.GameEngine.screenSize);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
}