@java.lang.Override
public synchronized void start() {
    if (alreadyTerminatedWhenDeserialized) {
        throw new java.lang.IllegalThreadStateException("This thread was deserialized from one that had already terminated");
    }
    setUncaughtExceptionHandler(this);
    super.start();
}