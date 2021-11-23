private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {
    parentFrame.remove(this);
    parentFrame.setVisible(false);
    com.chat.view.MainPanel panel = new com.chat.view.MainPanel(parentFrame);
    parentFrame.add(panel);
    parentFrame.validate();
    parentFrame.repaint();
    parentFrame.setVisible(true);
}