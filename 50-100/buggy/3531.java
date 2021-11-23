@java.lang.Override
public void setStackingVertexPanel(V v, java.util.Collection<V> allPhysical) {
    virtV = v;
    remove(rightPanel);
    rightPanel = new javax.swing.JPanel();
    rightPanel.setLayout(new java.awt.BorderLayout());
    add(rightPanel, java.awt.BorderLayout.LINE_END);
    rightPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 10, 500, 10));
    rightPanel.setSize(200, 500);
    rightPanel.setPreferredSize(new java.awt.Dimension(200, 500));
    addContentToStackingVertexPanel(rightPanel, v, allPhysical);
}