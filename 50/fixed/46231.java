@java.lang.Override
public E take() throws java.lang.InterruptedException {
    return this.takeStrategy.waitPoll(this);
}