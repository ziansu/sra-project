public void endLoop() {
    currentLoop.endLoop();
    if (!(controlFlowStack.empty())) {
        currentBlock = controlFlowStack.pop();
        if ((currentBlock) instanceof ir.cfgraph.Branch)
            currentBranch = ((ir.cfgraph.Branch) (currentBlock));
        else
            currentBranch = null;
        
        if ((currentBlock) instanceof ir.cfgraph.Loop)
            currentLoop = ((ir.cfgraph.Loop) (currentBlock));
        else
            currentLoop = null;
        
    }else
        currentLoop = null;
    
}