public static void switchPanels(javax.swing.JPanel newPanel) {
    PCNMClient.PCNMClientStart.appWindow.getContentPane().removeAll();
    PCNMClient.PCNMClientStart.appWindow.setSize(newPanel.getMinimumSize());
    PCNMClient.PCNMClientStart.appWindow.getContentPane().add(newPanel);
    newPanel.setVisible(true);
    PCNMClient.PCNMClientStart.appWindow.repaint();
    PCNMClient.PCNMClientStart.appWindow.setVisible(true);
}