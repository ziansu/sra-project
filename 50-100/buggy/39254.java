@java.lang.Override
public void eventRaised(org.ovirt.engine.ui.uicompat.Event<? extends org.ovirt.engine.ui.uicompat.EventArgs> ev, java.lang.Object sender, org.ovirt.engine.ui.uicompat.EventArgs args) {
    org.ovirt.engine.ui.uicommonweb.models.ListModel<org.ovirt.engine.ui.uicommonweb.models.vms.ImportEntityData<E>> entities = ((org.ovirt.engine.ui.uicommonweb.models.ListModel<org.ovirt.engine.ui.uicommonweb.models.vms.ImportEntityData<E>>) (sender));
    org.ovirt.engine.ui.uicommonweb.models.vms.ImportEntityData<E> importEntityData = entities.getSelectedItem();
    registerEntityInfoPanel.updateTabsData(importEntityData);
}