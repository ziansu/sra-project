public static javax.swing.JFrame createWindow() {
    javax.swing.JFrame mainwindow = new javax.swing.JFrame("A Maze Quest");
    mainwindow.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    mainwindow.setSize(1024, 768);
    mainwindow.setResizable(true);
    mainwindow.setVisible(true);
    return mainwindow;
}