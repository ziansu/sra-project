public static void main(java.lang.String[] args) {
    javax.swing.JFrame myFrame = new javax.swing.JFrame("Mine Sweeper");
    javax.swing.JButton refresh = new javax.swing.JButton("Refresh");
    myFrame.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
    myFrame.setLocation(400, 150);
    myFrame.setSize(400, 400);
    MyGrid myPanel = new MyGrid();
    myFrame.add(myPanel);
    myPanel.add(refresh);
    Mouse myMouseAdapter = new Mouse();
    myFrame.addMouseListener(myMouseAdapter);
    myFrame.setVisible(true);
}