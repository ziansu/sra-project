@java.lang.Override
public final void addBlock(nl.tudelft.b_b_w.model.block.Block block) {
    if (getDatabaseHandler.containsRevoke(block.getOwner().getName(), block.getPublicKey()))
        throw new java.lang.RuntimeException("Block already revoked");
    
    if (blockExists(block.getOwner().getName(), block.getPublicKey(), block.isRevoked()))
        throw new java.lang.RuntimeException("block already exists");
    
    mutateDatabaseHandler.addBlock(block);
}