@java.lang.Override
public void work() {
    if ((this.currentPos) >= (this.end)) {
        super.RUNNING = false;
        return ;
    }
    boolean status = executeQuery(this.currentPos, java.lang.Math.min(((this.currentPos) + (this.stepSize)), this.end));
    if (status) {
        currentPos += (super.totalSourceNum) * (this.stepSize);
    }
}