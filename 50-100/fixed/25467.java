public static void checkMaintenanceMode(com.vmware.vim25.mo.Datastore datastore, com.vmware.vim25.DatastoreSummary summary) throws java.lang.Exception {
    java.lang.String mode = summary.getMaintenanceMode();
    if (DatastoreSummaryMaintenanceModeState.enteringMaintenance.name().equals(mode)) {
        throw new java.lang.Exception((("Datastore " + (datastore.getName())) + " is entering maintenance mode"));
    }
}