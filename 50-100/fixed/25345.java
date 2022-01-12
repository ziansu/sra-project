private void addButton(java.lang.String text) {
    javax.swing.JButton button = new javax.swing.JButton(text);
    button.setAlignmentX(container.CENTER_ALIGNMENT);
    button.addMouseListener(new edu.chl.Game.handler.MouseInput());
    button.setMaximumSize(new java.awt.Dimension(180, 50));
    container.add(button);
}