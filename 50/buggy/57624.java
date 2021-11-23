@java.lang.Override
public E take() throws java.lang.InterruptedException {
    return takeStrategy.waitPoll(q);
}