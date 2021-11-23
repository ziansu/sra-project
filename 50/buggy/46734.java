protected void removeVmFromDb() {
    removeLunDisks();
    org.ovirt.engine.core.bll.RemoveVmCommand.removeVmUsers();
    org.ovirt.engine.core.bll.RemoveVmCommand.removeVmNetwork();
    org.ovirt.engine.core.bll.RemoveVmCommand.removeVmSnapshots();
    removeVmStatic(getParameters().isRemovePermissions());
    removeIcons();
}