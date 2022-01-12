public void closePath(ddg.model.FileSystemClient client, java.lang.String filePath, ddg.kernel.Time now) {
    ddg.model.data.ReplicationGroup replicationGroup = openFiles.remove(filePath);
    ddg.kernel.Time noTime = new ddg.kernel.Time(0, ddg.kernel.Time.Unit.SECONDS);
    boolean hasChanged = !(noTime.equals(replicationGroup.getTotalChangesDuration()));
    if ((replicationGroup != null) && hasChanged) {
        ddg.kernel.Time time = now.plus(timeBeforeUpdateReplicas);
        send(new ddg.emulator.event.filesystem.UpdateReplicationGroup(this, time, replicationGroup.getTotalChangesDuration(), filePath));
    }
}