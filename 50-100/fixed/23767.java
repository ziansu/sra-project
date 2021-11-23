public java.lang.String content_validate(javax.swing.JTextField val) {
    java.lang.String s = val.getText();
    if (s.equals("")) {
        javax.swing.JOptionPane.showMessageDialog(this, "required value");
        return null;
    }else {
        s = s.replaceAll(" ", "_");
        val.setText(s);
        return s;
    }
}