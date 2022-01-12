@java.lang.Override
public void afterCommit() throws java.lang.Exception {
    dropMessage(reference);
    wakeup();
}