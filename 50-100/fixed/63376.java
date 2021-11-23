public void fireworks() {
    javax.swing.JFrame frame = new javax.swing.JFrame();
    javax.swing.ImageIcon icon = new javax.swing.ImageIcon("./img/fireworks.jpg");
    javax.swing.JLabel label = new javax.swing.JLabel(icon);
    frame.add(label);
    frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
    java.lang.System.out.println("Hooray.");
}