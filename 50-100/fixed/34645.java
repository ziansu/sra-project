@java.lang.Override
public void valueChanged(javax.swing.event.TreeSelectionEvent event) {
    if ((selectedView) != null) {
        selectedView.setSelected(false);
    }
    if ((event.getNewLeadSelectionPath()) == null) {
        selectedView = null;
        return ;
    }
    javax.swing.tree.DefaultMutableTreeNode newNode = ((javax.swing.tree.DefaultMutableTreeNode) (event.getNewLeadSelectionPath().getLastPathComponent()));
    com.badoo.hprof.viewer.model.View newView = ((com.badoo.hprof.viewer.model.View) (newNode.getUserObject()));
    newView.setSelected(true);
    selectedView = newView;
    updateImage(false);
}