public void actionPerformed(java.awt.event.ActionEvent arg0) {
    listPanel.getList().setModel(new javax.swing.DefaultListModel());
    listPanel.repaint();
    wordSearchGUI.revalidate();
    wordSearchGUI.repaint();
    wordSearchGUI.getCategoryPanel().setVisible(false);
    wordSearchGUI.getCardLayout().show(wordSearchGUI.getCard(), "Menu");
}