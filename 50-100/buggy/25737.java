protected void build() {
    setLayout(new java.awt.BorderLayout());
    setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
    model = new org.openstreetmap.josm.gui.tagging.TagEditorModel();
    org.openstreetmap.josm.gui.tagging.TagTable tblTags = new org.openstreetmap.josm.gui.tagging.TagTable(model);
    tblTags.setEnabled(false);
    add(new javax.swing.JScrollPane(tblTags), java.awt.BorderLayout.CENTER);
}