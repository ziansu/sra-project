private java.lang.String getExistingString(javax.swing.JComboBox l, java.lang.String n) {
    java.lang.System.out.println(n);
    for (int i = 0; i < (l.getItemCount()); i++) {
        l.setSelectedIndex(i);
        java.lang.String n1 = l.getSelectedItem().toString();
        java.lang.System.out.println(n1);
        if (n1.endsWith(n)) {
            return n1;
        }
    }
    return "";
}