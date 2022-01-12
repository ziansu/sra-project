public static void main(java.lang.String[] args) {
    javax.swing.JFrame window = new javax.swing.JFrame("Main Window!");
    grts.Main.MainPanel MP = new grts.Main.MainPanel();
    window.setLocationRelativeTo(null);
    window.setPreferredSize(new java.awt.Dimension(((MP.WIDTH) * (MP.SCALE)), ((MP.HIGHT) * (MP.SCALE))));
    window.setContentPane(MP);
    window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    window.setResizable(false);
    window.pack();
    window.setVisible(true);
}