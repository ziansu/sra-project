@java.lang.Override
public void componentActivated() {
    super.componentActivated();
    this.editorSupport.onEditorActivated();
    if (rootToCentre) {
        rootToCentre = false;
        javax.swing.SwingUtilities.invokeLater(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                final com.igormaznitsa.mindmap.model.Topic root = ((mindMapPanel.getModel()) == null) ? null : mindMapPanel.getModel().getRoot();
                if (root != null) {
                    topicToCentre(root);
                }
            }
        });
    }
}