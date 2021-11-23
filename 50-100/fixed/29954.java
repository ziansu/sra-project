private static javax.swing.JComponent createColorRect(java.awt.Color color, java.lang.String text) {
    javax.swing.JLabel label = new javax.swing.JLabel(text, javax.swing.SwingConstants.CENTER);
    label.setOpaque(true);
    label.setFont(label.getFont().deriveFont(java.awt.Font.BOLD, 40.0F));
    label.setBackground(color);
    label.setPreferredSize(new java.awt.Dimension(100, 100));
    return label;
}