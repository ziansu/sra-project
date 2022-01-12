public java.util.List<edu.uci.ccai6.cs241.ssa.Instruction> runAll() {
    java.util.List<java.lang.Integer> bbNum = assignBlockNum();
    int numBlocks = (bbNum.get(((bbNum.size()) - 1))) + 1;
    java.util.List<edu.uci.ccai6.cs241.ssa.BasicBlock> bbs = generateBasicBlocks(bbNum, numBlocks);
    rename(bbs, bbNum);
    copyProp();
    cse();
    copyProp();
    killPtrOp();
    return this.instructions;
}