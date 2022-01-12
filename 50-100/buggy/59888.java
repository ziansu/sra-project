@java.lang.Override
public gate.Resource init() {
    setLayout(new java.awt.BorderLayout());
    textArea = new javax.swing.JTextPane() {
        private static final long serialVersionUID = 3279170264365877569L;

        {
            this.setEditorKitForContentType("text/xml", new gate.gui.schema.SimpleSchemaViewer.XmlEditorKit());
            this.setContentType("text/xml");
            this.setEditable(false);
        }
    };
    javax.swing.JScrollPane textScroll = new javax.swing.JScrollPane(textArea, javax.swing.JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    add(textScroll, java.awt.BorderLayout.CENTER);
    return this;
}