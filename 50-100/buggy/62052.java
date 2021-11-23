public void setType(java.lang.String type) {
    java.lang.String newType;
    if (type == null) {
        newType = net.sf.jabref.model.entry.BibEntry.DEFAULT_TYPE;
    }else {
        newType = type;
    }
    java.lang.String oldType = this.type;
    try {
        this.type = newType.toLowerCase(java.util.Locale.ENGLISH);
        changed = true;
        firePropertyChangedEvent(net.sf.jabref.model.entry.BibEntry.TYPE_HEADER, oldType, newType);
    } catch (java.beans.PropertyVetoException pve) {
        net.sf.jabref.model.entry.BibEntry.LOGGER.warn(pve);
    }
}