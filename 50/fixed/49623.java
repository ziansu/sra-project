public boolean isError() {
    java.lang.String status = getStatus();
    return (status != null) && (status.equals(com.emc.storageos.db.client.model.Task.Status.error.name()));
}