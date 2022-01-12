protected boolean MinMaxValuesCheck(javax.swing.JTextField fieldMin, javax.swing.JTextField fieldMax) {
    if ((fieldMin.getText().matches("\\d+([.]{1})?(\\d+)?(E)?(e)?(-)?(\\d+)?")) == false) {
        fieldMin.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, java.awt.Color.red));
        fieldMin.setBackground(bgColor);
        return false;
    }else {
        fieldMin.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, java.awt.Color.BLACK));
        fieldMin.setBackground(java.awt.Color.WHITE);
        return true;
    }
}