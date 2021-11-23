@java.lang.Override
public com.emc.storageos.model.TaskList create(java.util.List<com.emc.storageos.db.client.model.BlockObject> fcSourceObjList, com.emc.storageos.db.client.model.VirtualArray varray, java.lang.String name, boolean createInactive, int count, java.lang.String taskId) {
    return super.create(fcSourceObjList, varray, name, true, count, taskId);
}