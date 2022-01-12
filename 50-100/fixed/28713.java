public void run() {
    javax.swing.SwingUtilities.invokeLater(new java.lang.Runnable() {
        public void run() {
            myComponent = new jetbrains.mps.nodeEditor.InspectorTool.MyPanel();
            myInspectorComponent = new jetbrains.mps.nodeEditor.inspector.InspectorEditorComponent();
            myComponent.add(myInspectorComponent.getExternalComponent(), java.awt.BorderLayout.CENTER);
            myMessagePanel.setNode(null);
            myComponent.add(myMessagePanel, java.awt.BorderLayout.NORTH);
        }
    });
}