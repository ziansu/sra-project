@java.lang.Override
public void propertyChange(java.beans.PropertyChangeEvent event) {
    if ((document) != null) {
        document.getLineManager().removeLineListener(this);
    }
    document = ((kkckkc.syntaxpane.model.SourceDocument) (event.getNewValue()));
    document.getLineManager().addLineListener(this);
    document.addFoldListener(new kkckkc.syntaxpane.model.MutableFoldManager.FoldListener() {
        public void foldUpdated() {
            repaint();
        }
    });
}