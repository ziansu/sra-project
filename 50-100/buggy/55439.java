public void paintComponent(java.awt.Graphics g) {
    remove(CurrentTankLabel);
    CurrentTankLabel = new javax.swing.JLabel(terrain.getCurrentTank().getName(), javax.swing.JLabel.CENTER);
    CurrentTankLabel.setForeground(terrain.getCurrentTank().getColor());
    CurrentTankLabel.setBounds(45, 70, 200, 30);
    add(CurrentTankLabel);
    repaint();
}