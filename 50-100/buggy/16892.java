public static void main(java.lang.String[] args) {
    javax.swing.JFrame frame = new javax.swing.JFrame();
    frame.setSize(800, 800);
    frame.setVisible(true);
    frontEnd.ProgressBar progress = new frontEnd.ProgressBar(new backEnd.TestAdapter());
    frame.add(progress);
    progress.createArcs(10);
    frame.setVisible(true);
}