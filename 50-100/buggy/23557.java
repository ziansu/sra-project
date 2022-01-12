private void addLabelToLoop(boolean isWaitStmt) {
    if (!isWaitStmt) {
        increaseLoopCounter();
        if (this.loopsLabels.get(this.currenLoop.getLast())) {
            this.sb.append((("loop" + (this.loopCounter)) + ":"));
            nlIndent();
        }
    }
}