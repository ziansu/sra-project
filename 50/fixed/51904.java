public static javax.swing.JLabel setBold(javax.swing.JLabel label) {
    java.awt.Font f = label.getFont();
    label.setFont(f.deriveFont(((f.getStyle()) | (java.awt.Font.BOLD))));
    return label;
}