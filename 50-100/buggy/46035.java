@java.lang.Override
public synchronized void serviceInit(org.apache.hadoop.conf.Configuration conf) {
    int numExecutors = conf.getInt(TezConfiguration.TEZ_AM_INLINE_TASK_EXECUTION_MAX_TASKS, TezConfiguration.TEZ_AM_INLINE_TASK_EXECUTION_MAX_TASKS_DEFAULT);
    com.google.common.base.Preconditions.checkState((numExecutors >= 1), "Must have at least 1 executor");
    java.util.concurrent.ExecutorService rawExecutor = java.util.concurrent.Executors.newFixedThreadPool(numExecutors, new com.google.common.util.concurrent.ThreadFactoryBuilder().setDaemon(true).setNameFormat("LocalTaskExecutionThread #%d").build());
    this.taskExecutorService = com.google.common.util.concurrent.MoreExecutors.listeningDecorator(rawExecutor);
}