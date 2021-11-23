public void actionPerformed(java.awt.event.ActionEvent e) {
    final java.awt.Panel panel = new java.awt.Panel(mainFrame);
    panel.add(statusbar, java.awt.BorderLayout.SOUTH);
    add(panel);
    startFrame.setVisible(false);
    panel.start();
}