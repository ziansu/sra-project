private void startJarJob(pl.edu.uj.engine.Jar jar) {
    logger.info(("Launching main class for jar " + jar));
    pl.edu.uj.engine.eventloop.EventLoopThread eventLoopThread = eventLoopThreadRegistry.create(jar);
    pl.edu.uj.engine.workerpool.LaunchingMainClassWorkerPoolTask task = new pl.edu.uj.engine.workerpool.LaunchingMainClassWorkerPoolTask(jar);
    pl.edu.uj.engine.EmptyCallback callback = new pl.edu.uj.engine.EmptyCallback();
    eventLoopThread.registerTask(task, callback);
    workerPool.submitTask(task);
}