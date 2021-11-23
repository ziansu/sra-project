protected void leave() {
    getManagementService().executeJob(delegate.getId());
}