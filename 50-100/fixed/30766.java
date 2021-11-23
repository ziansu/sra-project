public void setFocusOwner(edu.udo.piq.PComponent component) {
    edu.udo.piq.PComponent oldOwner = getFocusOwner();
    if (component == oldOwner) {
        return ;
    }
    if (oldOwner != null) {
        fireFocusLostEvent(oldOwner);
    }
    focusOwner = component;
    if ((getFocusOwner()) != null) {
        fireFocusGainedEvent(oldOwner);
    }
}