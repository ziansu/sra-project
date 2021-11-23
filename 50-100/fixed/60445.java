public void display() {
    javax.swing.JEditorPane jep = new javax.swing.JEditorPane();
    jep.setEditable(false);
    javax.swing.JScrollPane scrollPane = new javax.swing.JScrollPane(jep);
    javax.swing.JFrame f = new javax.swing.JFrame();
    f.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    f.getContentPane().add(scrollPane);
    f.setMinimumSize(new java.awt.Dimension(800, 600));
    f.setVisible(true);
}