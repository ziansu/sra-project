private void setKi(javax.swing.JCheckBox chkbx) {
    optionsView.setKi(chkbx);
    playerIsKi = new boolean[this.player];
    for (int i = 0; i < (this.optionsView.getKiBox().length); i++) {
        this.playerIsKi[i] = this.optionsView.getKiBox()[i].isSelected();
    }
}