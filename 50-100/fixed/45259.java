@java.lang.Override
public void updateUI() {
    super.updateUI();
    javax.swing.UIManager.put("ComboBox.squareButton", java.lang.Boolean.FALSE);
    setUI(new javax.swing.plaf.basic.BasicComboBoxUI() {
        @java.lang.Override
        protected javax.swing.JButton createArrowButton() {
            javax.swing.JButton b = super.createArrowButton();
            b.setVisible(false);
            return b;
        }
    });
}