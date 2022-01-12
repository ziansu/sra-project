@java.lang.Override
public void handle(se.sics.gvod.core.msg.PlayReady resp) {
    se.sics.gvod.manager.VoDManagerImpl.LOG.info("{} video:{} ready to play", logPrefix, resp.videoName);
    vsMngrs.put(resp.videoName, resp.vsMngr);
    com.google.common.util.concurrent.SettableFuture<java.lang.Boolean> myFuture = pendingJobs.remove(resp.id);
    if (myFuture == null) {
        se.sics.gvod.manager.VoDManagerImpl.LOG.error("missing job");
        throw new java.lang.RuntimeException("missing job");
    }
    myFuture.set(true);
}