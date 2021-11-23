private void makeCustomButton(javax.swing.JButton butt, java.lang.String unpressed, java.lang.String pressed) {
    butt.setIcon(new javax.swing.ImageIcon(getClass().getResource(unpressed)));
    butt.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource(pressed)));
    butt.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource(unpressed)));
    butt.setOpaque(false);
    butt.setContentAreaFilled(false);
    butt.setBorderPainted(false);
    butt.setFocusPainted(false);
}