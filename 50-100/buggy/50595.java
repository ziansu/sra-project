private void updateFailedVolumeTasks(com.emc.storageos.db.client.DbClient dbClient, java.util.List<java.net.URI> uriList, java.lang.String taskId, com.emc.storageos.svcs.errorhandling.model.ServiceCoded e) {
    for (java.net.URI uri : uriList) {
        com.emc.storageos.db.client.model.Volume vol = dbClient.queryObject(com.emc.storageos.db.client.model.Volume.class, uri);
        com.emc.storageos.db.client.model.Operation op = vol.getOpStatus().get(taskId);
        if (op != null) {
            op.error(e);
            vol.getOpStatus().updateTaskStatus(taskId, op);
            dbClient.updateObject(vol);
        }
    }
}