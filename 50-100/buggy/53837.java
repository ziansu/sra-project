private javax.swing.JPanel makeMessagePanel() {
    javax.swing.JPanel panel = new javax.swing.JPanel();
    panel.setBackground(allnetui.ConversationPanel.backgroundColor);
    panel.setLayout(new javax.swing.BoxLayout(panel, javax.swing.BoxLayout.Y_AXIS));
    panel.add(javax.swing.Box.createRigidArea(new java.awt.Dimension(0, 10)));
    panel.add(morePanel);
    panel.add(javax.swing.Box.createRigidArea(new java.awt.Dimension(0, 10)));
    panel.addComponentListener(this);
    return panel;
}