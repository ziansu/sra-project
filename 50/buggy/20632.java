@java.lang.Override
public void lockInterruptibly() throws java.lang.InterruptedException {
    this.lockInterruptibly(ExpireMode.IGNORE, 1000);
}