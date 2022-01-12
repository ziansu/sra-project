public void propertyChange(java.beans.PropertyChangeEvent evt) {
    if (IShell.PROP_MODEL.equals(evt.getPropertyName())) {
        synchronized(this) {
            edu.gemini.qpt.core.Schedule newModel = ((edu.gemini.qpt.core.Schedule) (evt.getNewValue()));
            if ((model) == null)
                ((javax.swing.tree.DefaultTreeModel) (tree.getModel())).setRoot(getRoot(newModel));
            
            model = newModel;
            updateSchedule();
        }
    }
}