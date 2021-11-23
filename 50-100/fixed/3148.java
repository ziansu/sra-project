private void takeOwnership(java.lang.String operationDisplayName) {
    while (((owner) != null) && ((owner) != (java.lang.Thread.currentThread()))) {
        try {
            condition.await();
        } catch (java.lang.InterruptedException e) {
            throw org.gradle.internal.UncheckedException.throwAsUncheckedException(e);
        }
    } 
    owner = java.lang.Thread.currentThread();
    operations.pushCacheAction(operationDisplayName);
}