private java.util.List<java.lang.Runnable> getTasks(de.bananaco.bpermissions.imp.loadmanager.TaskRunnable.TaskType type) {
    if (type == (de.bananaco.bpermissions.imp.loadmanager.TaskRunnable.TaskType.LOAD)) {
        return load;
    }
    if (type == (de.bananaco.bpermissions.imp.loadmanager.TaskRunnable.TaskType.SAVE)) {
        return save;
    }
    if (type == (de.bananaco.bpermissions.imp.loadmanager.TaskRunnable.TaskType.PLAYER_SETUP)) {
        return playerSetup;
    }
    if (type == (de.bananaco.bpermissions.imp.loadmanager.TaskRunnable.TaskType.SERVER)) {
        return server;
    }
    return null;
}