public static void main(java.lang.String[] args) {
    javax.swing.JFrame f = new javax.swing.JFrame("Besmoke");
    f.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    MainPanel p = new MainPanel();
    f.getContentPane().add(p);
    f.pack();
    f.setVisible(true);
}