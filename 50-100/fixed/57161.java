public void resumeReads() {
    int state;
    while (true) {
        state = readState;
        if (state == 0) {
            return ;
        }
        if (org.xnio.nio.NioSocketConduit.readStateUpdater.compareAndSet(this, 1, 3)) {
            try {
                resume(java.nio.channels.SelectionKey.OP_READ);
            } finally {
                org.xnio.nio.NioSocketConduit.readStateUpdater.set(this, 0);
            }
            break;
        }
    } 
}