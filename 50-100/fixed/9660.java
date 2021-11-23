public static void main(java.lang.String[] args) {
    javax.swing.JFrame window = new javax.swing.JFrame("Main Window!");
    window.setContentPane(new grts.Main.MainPanel());
    window.setResizable(false);
    window.pack();
    window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);
}