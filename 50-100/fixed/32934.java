@java.lang.Override
protected javax.swing.JComponent decorateMainPanel(final org.datacleaner.panels.DCPanel panel) {
    javax.swing.JComponent result = super.decorateMainPanel(panel);
    javax.swing.JPanel outerPanel = new javax.swing.JPanel(new java.awt.BorderLayout());
    javax.swing.JLabel label = new javax.swing.JLabel("Hello DataCleaner users! This label was drawn by our extension!");
    label.setOpaque(false);
    label.setBorder(new javax.swing.border.EmptyBorder(20, 20, 20, 20));
    outerPanel.add(label, java.awt.BorderLayout.NORTH);
    outerPanel.add(result, java.awt.BorderLayout.CENTER);
    return outerPanel;
}