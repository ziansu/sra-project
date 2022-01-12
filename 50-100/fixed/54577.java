protected void setDirtyManager(com.orientechnologies.orient.core.record.impl.ODirtyManager dirtyManager) {
    if (((this._dirtyManager) != null) && (dirtyManager != null)) {
        dirtyManager.merge(this._dirtyManager);
    }
    this._dirtyManager = dirtyManager;
    if (((this.getIdentity().isNew()) && ((getOwner()) == null)) && ((this._dirtyManager) != null))
        this._dirtyManager.setDirty(this);
    
}