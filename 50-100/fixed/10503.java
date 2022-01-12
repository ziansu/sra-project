public void addLoop() {
    currentLoop = new ir.cfgraph.Loop();
    if ((startingBlock) == null) {
        currentBlock = startingBlock = currentLoop;
    }else
        if ((currentBlock) instanceof ir.cfgraph.ControlFlow) {
            ir.cfgraph.ControlFlow cf = ((ir.cfgraph.ControlFlow) (currentBlock));
            controlFlowStack.push(currentBlock);
            if (cf.isComplete())
                currentBlock.setSuccessor(currentBranch);
            else
                cf.addBlock(currentLoop);
            
        }else
            currentBlock.setSuccessor(currentLoop);
        
    
    currentBlock = currentLoop;
}