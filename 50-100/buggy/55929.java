public void updatePanel() {
    buttonPanel.removeAll();
    for (java.lang.String template : manager.getTemplateNames()) {
        java.awt.Image thumbnail = manager.getThumbnail(template);
        javax.swing.JButton templateButton = new javax.swing.JButton(template, new javax.swing.ImageIcon(thumbnail));
        templateButton.setActionCommand(template);
        templateButton.addActionListener(this);
        buttonPanel.add(javax.swing.Box.createRigidArea(new java.awt.Dimension(0, 5)));
        buttonPanel.add(templateButton);
    }
    scrollPane.setViewportView(buttonsPanel);
}