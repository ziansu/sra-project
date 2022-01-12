public static void main(java.lang.String[] args) {
    javax.swing.JFrame myFrame = new javax.swing.JFrame("Minesweeper");
    MyPanel myPanel = new MyPanel();
    MyMouseAdapter myMouseAdapter = new MyMouseAdapter();
    myFrame.add(myPanel);
    myFrame.addMouseListener(myMouseAdapter);
    myFrame.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
    myFrame.setLocation(500, 200);
    myFrame.setSize(325, 375);
    myFrame.setResizable(false);
    myFrame.setVisible(true);
    myPanel.resetButton.doClick();
}