@java.lang.Override
public void eventRaised(org.ovirt.engine.ui.uicompat.Event<? extends org.ovirt.engine.ui.uicompat.EventArgs> ev, java.lang.Object sender, org.ovirt.engine.ui.uicompat.EventArgs args) {
    @java.lang.SuppressWarnings(value = "unchecked")
    org.ovirt.engine.ui.uicommonweb.models.ListModel<org.ovirt.engine.core.common.businessentities.StorageDomain> list = ((org.ovirt.engine.ui.uicommonweb.models.ListModel<org.ovirt.engine.core.common.businessentities.StorageDomain>) (sender));
    if ((list.getSelectedItem().getStorageType().isBlockDomain()) && (containsKvmOrigin())) {
        setMessage(org.ovirt.engine.ui.uicommonweb.models.vms.ImportVmFromExternalSourceModel.constants.kvmBlockDomainWraning());
    }else {
        setMessage("");
    }
}