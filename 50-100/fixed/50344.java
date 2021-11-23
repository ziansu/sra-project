public void addStatement(ir.ops.Statement statement) {
    if ((startingBlock) == null) {
        startingBlock = new ir.cfgraph.BasicBlock();
        currentBlock = startingBlock;
    }else
        if (((currentBlock) instanceof ir.cfgraph.ControlFlow) && (((ir.cfgraph.ControlFlow) (currentBlock)).isComplete())) {
            ir.cfgraph.BasicBlock successor = new ir.cfgraph.BasicBlock();
            currentBlock.setSuccessor(successor);
            currentBlock = successor;
        }
    
    currentBlock.addStatement(statement);
}