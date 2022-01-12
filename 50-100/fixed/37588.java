public static void main(java.lang.String[] args) {
    BouncingBalls appletClass = new BouncingBalls();
    javax.swing.JFrame frame = new javax.swing.JFrame();
    frame.setLayout(new java.awt.GridLayout(1, 1));
    frame.add(appletClass);
    frame.setMinimumSize(new java.awt.Dimension(400, 400));
    frame.setVisible(true);
    appletClass.init();
    appletClass.start();
}