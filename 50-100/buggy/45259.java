@java.lang.Override
public void updateUI() {
    super.updateUI();
    javax.swing.UIManager.put("ComboBox.squareButton", java.lang.Boolean.FALSE);
    setUI(new javax.swing.plaf.basic.BasicComboBoxUI() {
        @java.lang.Override
        protected javax.swing.JButton createArrowButton() {
            javax.swing.JButton b = new javax.swing.JButton();
            b.setBorder(javax.swing.BorderFactory.createEmptyBorder());
            b.setVisible(false);
            return b;
        }
    });
    setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.GRAY));
}