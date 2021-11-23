private void triggerDatabaseEvent(boolean availableOnly) {
    if ((((activeActivity) != null) && ((activeActivity) == (databaseListenerActivity))) && ((activeActivity) instanceof org.opendatakit.common.android.listener.DatabaseConnectionListener)) {
        if ((this.getDatabase()) == null) {
            if (!availableOnly) {
                ((org.opendatakit.common.android.listener.DatabaseConnectionListener) (activeActivity)).databaseUnavailable();
            }
        }else {
            ((org.opendatakit.common.android.listener.DatabaseConnectionListener) (activeActivity)).databaseAvailable();
        }
    }
}