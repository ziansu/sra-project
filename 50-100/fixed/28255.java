protected javax.swing.JLabel getLabel(java.lang.String title) {
    javax.swing.ImageIcon imcon = new javax.swing.ImageIcon(getClass().getResource("orange-dot.png"));
    javax.swing.JLabel label = new javax.swing.JLabel(imcon);
    label.setText(title);
    label.setIconTextGap(10);
    label.setHorizontalTextPosition(javax.swing.JLabel.LEFT);
    label.setVerticalTextPosition(javax.swing.JLabel.TOP);
    return label;
}