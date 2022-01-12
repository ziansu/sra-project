private void buildStatusBar() {
    this.setBackground(java.awt.Color.WHITE);
    javax.swing.JPanel leftSection = new javax.swing.JPanel();
    leftSection.add(loadedEvents);
    javax.swing.JPanel middleSection = new javax.swing.JPanel();
    middleSection.add(statusMessage);
    javax.swing.JPanel rightSection = new javax.swing.JPanel();
    rightSection.add(loadedEvents);
    this.setLayout(new java.awt.GridLayout(0, 3));
    this.add(leftSection);
    this.add(middleSection);
    this.add(rightSection);
    this.setVisible(true);
}