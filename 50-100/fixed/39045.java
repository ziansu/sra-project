public static void show(java.awt.image.BufferedImage originalImage, java.awt.image.BufferedImage scaledImage) {
    javax.swing.JPanel panel = new javax.swing.JPanel();
    panel.add(new javax.swing.JLabel(new javax.swing.ImageIcon(originalImage)));
    panel.add(new javax.swing.JLabel(new javax.swing.ImageIcon(scaledImage)));
    javax.swing.JFrame frame = new javax.swing.JFrame("Display images");
    frame.getContentPane().add(panel);
    frame.pack();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
}