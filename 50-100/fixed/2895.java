protected boolean MinMaxValuesCheck(javax.swing.JTextField field) {
    if ((field.getText().matches("\\d+([.]{1})?(\\d+)?(E)?(e)?(-)?(\\d+)?")) == false) {
        field.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, java.awt.Color.red));
        field.setBackground(bgColor);
        return false;
    }else {
        field.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, java.awt.Color.BLACK));
        field.setBackground(java.awt.Color.WHITE);
        return true;
    }
}