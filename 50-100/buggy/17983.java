void submitEvent(nna.base.util.concurrent.AbstractTask t, java.lang.Object object, int taskStatus) {
    java.lang.Integer workId = t.getWorkId();
    nna.base.util.concurrent.Worker worker = balancedWorkerList.get(workId.intValue());
    java.lang.Long taskSeq = t.getIndex();
    java.util.concurrent.ConcurrentHashMap<java.lang.Long, nna.base.util.concurrent.AbstractTasks> workMap = worker.getWorkMap();
    nna.base.util.concurrent.AbstractTasks abstractTasks = workMap.get(taskSeq);
    abstractTasks.addTask(t, taskStatus, object);
    java.lang.Runnable nonInitDispatcher = new nna.base.util.concurrent.NonInitDispatcher(abstractTasks, worker);
    nna.base.util.concurrent.WorkerManager.cachedService.submit(nonInitDispatcher);
}