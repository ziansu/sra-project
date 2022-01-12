@java.lang.Override
public void onSuccess(java.lang.Object target, java.lang.Object returnValue) {
    java.util.Iterator<org.ovirt.engine.ui.uicommonweb.models.vms.InstanceImageLineModel> lineModelIterator = orderedDisksIterator(((java.util.List<org.ovirt.engine.core.common.businessentities.storage.Disk>) (returnValue)), vm);
    storeNextDisk(lineModelIterator, vm);
}