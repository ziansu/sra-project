private void createPanel() {
    this.setLayout(new java.awt.BorderLayout());
    this.add(actionPanel, java.awt.BorderLayout.NORTH);
    this.add(animationComponent, java.awt.BorderLayout.CENTER);
    javax.swing.JPanel labels = new javax.swing.JPanel();
    labels.add(radius);
    labels.add(linearVelocity);
    labels.add(angularVelocity);
    this.add(labels, java.awt.BorderLayout.SOUTH);
}