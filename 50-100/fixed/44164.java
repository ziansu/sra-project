private void addInfo() {
    if (infoAdded) {
        return ;
    }
    java.awt.GridBagConstraints gbc = chatty.gui.components.userinfo.Util.makeGbc(0, 7, 3, 1);
    gbc.insets = new java.awt.Insets((-8), 5, 0, 5);
    add(panel2, gbc);
    revalidate();
    owner.finishDialog();
    infoAdded = true;
}