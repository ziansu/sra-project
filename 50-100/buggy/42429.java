public void setModel(java.lang.Object model) {
    this.model = model;
    net.rpgtoolkit.editor.ui.AbstractModelPanel panel = net.rpgtoolkit.editor.ui.ModelPanelFactory.getModelPanel(model);
    javax.swing.JPanel intermediate = new javax.swing.JPanel(new java.awt.FlowLayout());
    intermediate.add(panel);
    this.propertiesScrollPane.setViewportView(intermediate);
    this.propertiesScrollPane.getViewport().revalidate();
}