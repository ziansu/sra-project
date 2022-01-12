@java.lang.Override
public void schedule(final net.xy.codebase.collection.TimeoutQueue.ITask capsule) {
    if ((capsule.nextRun()) <= 0)
        capsule.run();
    else
        this.tque.add(capsule);
    
}