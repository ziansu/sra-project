private javax.swing.JPanel buildCentralPanel() {
    javax.swing.JPanel panel = new javax.swing.JPanel();
    panel.setLayout(new javax.swing.BoxLayout(panel, javax.swing.BoxLayout.PAGE_AXIS));
    panel.add(buildPanel("REGULAR EXPRESSION:", inputField), java.awt.BorderLayout.PAGE_START);
    panel.add(buildPanel("TEXT TO MATCH:", matchingArea), java.awt.BorderLayout.CENTER);
    panel.add(buildComparingFields(), java.awt.BorderLayout.PAGE_END);
    return panel;
}