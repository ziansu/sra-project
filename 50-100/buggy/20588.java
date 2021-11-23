private void setShortNameInternal(final java.lang.String iShortName) {
    getDatabase().checkSecurity(ORule.ResourceGeneric.SCHEMA, ORole.PERMISSION_UPDATE);
    acquireSchemaWriteLock();
    try {
        checkEmbedded();
        java.lang.String oldName = null;
        if ((this.shortName) != null)
            oldName = this.shortName.toLowerCase();
        
        this.shortName = iShortName;
        owner.changeClassName(oldName, shortName, this);
    } finally {
        releaseSchemaWriteLock();
    }
}