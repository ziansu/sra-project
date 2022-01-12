@java.lang.Override
public void run() {
    while ((!(stopped.get())) && (!(java.lang.Thread.interrupted()))) {
        syncPolicy.sync(com.tencent.angel.psagent.PSAgentContext.get().getMatricesCache());
        try {
            java.lang.Thread.sleep(syncTimeIntervalMS);
        } catch (java.lang.InterruptedException e) {
        }
    } 
}