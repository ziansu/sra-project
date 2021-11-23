public void propertyChange(java.beans.PropertyChangeEvent event) {
    if (updating) {
        return ;
    }
    updating = true;
    if (org.eclipse.virgo.ide.runtime.core.IServer.PROPERTY_ARTEFACT_ORDER.equals(event.getPropertyName())) {
        initialize();
    }
    updating = false;
}