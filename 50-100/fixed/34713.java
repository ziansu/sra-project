private final void buildWindow() {
    frame = new javax.swing.JFrame(title);
    frame.setSize(new java.awt.Dimension(width, height));
    frame.setResizable(true);
    frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    canvas = new java.awt.Canvas();
    frame.add(canvas);
    frame.setVisible(true);
}