public void setListName(java.lang.String listName) {
    if (!(listNameEditSupported)) {
        throw new java.lang.RuntimeException(("Error: Attempted to edit Channel List name for " + "group that does not support it."));
    }
    java.lang.String oldListName = this.listName;
    this.listName = listName;
    if ((propSupport) != null) {
        propSupport.firePropertyChange("listName", oldListName, listName);
    }
}