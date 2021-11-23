void submitInitEvent(nna.base.util.concurrent.AbstractTask t, java.lang.Object object, int taskStatus) {
    nna.base.util.concurrent.AbstractTasks abstractTasks = new nna.base.util.concurrent.SeqAbstractTasks(t.getWorkCount());
    abstractTasks.addTask(t, taskStatus, object);
    nna.base.util.concurrent.WorkerManager.Entry entry = getBalanceWorker();
    nna.base.util.concurrent.Worker worker = entry.worker;
    int workId = entry.entryId;
    t.setWorkId(workId);
    java.lang.Long taskSeq = Worker.taskNo.getAndIncrement();
    t.setIndex(taskSeq);
    java.lang.Runnable initDispatcher = new nna.base.util.concurrent.InitDispatcher(abstractTasks, worker);
    nna.base.util.concurrent.WorkerManager.cachedService.submit(initDispatcher);
}