@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public void addGroupToWorker(java.lang.String workerUuid, java.lang.String group) {
    if (group == null) {
        return ;
    }
    io.cloudslang.engine.node.entities.WorkerNode worker = readByUUID(workerUuid);
    if (!(worker.getGroups().contains(group))) {
        java.util.List<java.lang.String> groups = new java.util.ArrayList(worker.getGroups());
        groups.add(group);
        worker.setGroups(groups);
    }
}