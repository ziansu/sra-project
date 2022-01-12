private boolean drainQueuesIfNeeded() {
    while (true) {
        if (getEmitLock()) {
            int emitted = 0;
            try {
                emitted = drainScalarValueQueue();
                drainChildrenQueues();
            } finally {
                boolean moreToDrain = releaseEmitLock();
                rx.internal.operators.OperatorMerge.MergeSubscriber.request(emitted);
                if (!moreToDrain) {
                    return true;
                }
            }
        }else {
            return false;
        }
    } 
}