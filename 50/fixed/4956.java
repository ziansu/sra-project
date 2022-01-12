@java.lang.Override
public int currentTask() {
    synchronized(this) {
        return currentTask;
    }
}