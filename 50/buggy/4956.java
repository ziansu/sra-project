@java.lang.Override
public int currentTask() {
    synchronized(this) {
        return this.currentTask;
    }
}