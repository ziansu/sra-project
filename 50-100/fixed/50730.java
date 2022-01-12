@java.lang.Override
protected java.lang.Long getRawValue(org.ovirt.engine.ui.uicommonweb.models.EntityModel object) {
    if ((object.getEntity()) instanceof org.ovirt.engine.core.common.businessentities.storage.RepoImage) {
        return ((org.ovirt.engine.core.common.businessentities.storage.RepoImage) (object.getEntity())).getSize();
    }else
        if ((object.getEntity()) instanceof org.ovirt.engine.core.common.businessentities.storage.DiskImage) {
            return ((org.ovirt.engine.core.common.businessentities.storage.DiskImage) (object.getEntity())).getSize();
        }
    
    return null;
}