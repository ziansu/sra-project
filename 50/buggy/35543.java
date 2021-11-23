@java.lang.Override
public void addBlock(ir.cfgraph.Block block) {
    if (isCompleted)
        throw new java.lang.RuntimeException("State of conditional is null.");
    
    currentBlock.setSuccessor(block);
}