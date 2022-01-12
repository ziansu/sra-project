private void addLabelToLoop() {
    increaseLoopCounter();
    if (this.loopsLabels.get(this.currenLoop.getLast())) {
        this.sb.append((("loop" + (this.currenLoop.getLast())) + ":"));
        nlIndent();
    }
}