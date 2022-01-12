protected org.eclipse.californium.core.network.stack.Block2BlockwiseStatus clearBlock2Status(final org.eclipse.californium.core.network.stack.KeyUri key) {
    synchronized(block2Transfers) {
        org.eclipse.californium.core.network.stack.Block2BlockwiseStatus removedTracker = block2Transfers.remove(key);
        org.eclipse.californium.core.network.stack.BlockwiseLayer.LOGGER.log(java.util.logging.Level.FINE, "removing block2 tracker [{0}], block2 transfers still in progress: {1}", new java.lang.Object[]{ key , block2Transfers.size() });
        return removedTracker;
    }
}