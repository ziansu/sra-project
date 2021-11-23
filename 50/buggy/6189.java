public void addToBoxList(java.lang.String name) {
    javax.swing.JLabel label = new javax.swing.JLabel(name);
    label.addMouseListener(adapter);
    label.setOpaque(true);
    objectBox.add(label);
    labels.add(label);
}