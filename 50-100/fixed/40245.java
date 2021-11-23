@java.lang.Override
public void run() {
    final com.igormaznitsa.mindmap.model.Topic root = ((mindMapPanel.getModel()) == null) ? null : mindMapPanel.getModel().getRoot();
    if (root != null) {
        mindMapPanel.select(root, false);
        topicToCentre(root);
    }
}