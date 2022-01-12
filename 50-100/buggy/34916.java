private void generateForm() {
    javax.swing.JFrame frame = new javax.swing.JFrame(mFormNode.toString());
    frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    frame.add(createComponents());
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    frame.setPreferredSize(new java.awt.Dimension(640, 480));
    frame.pack();
}