protected javax.swing.JButton makeButton(java.lang.String text, java.lang.String name) {
    javax.swing.JButton btn;
    btn = new javax.swing.JButton(text);
    btn.setName(name);
    btn.addActionListener(this);
    btn.addKeyListener(this);
    return btn;
}