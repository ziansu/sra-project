@java.lang.Override
public void schedule(final net.xy.codebase.collection.TimeoutQueue.ITask capsule) {
    if ((capsule.nextRun()) <= 0) {
        java.lang.System.out.println("Firing direct");
        capsule.run();
    }else
        this.tque.add(capsule);
    
}