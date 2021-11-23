public boolean isDeleteable() {
    if ((getLibrary()) == null)
        return false;
    
    if ((getOwningComponent().getParent()) == null)
        return true;
    
    if (getOwningComponent().getParent().isOperation())
        return isEditable();
    
    return getLibrary().isManaged() ? (isInHead()) && (isEditable()) : isEditable();
}