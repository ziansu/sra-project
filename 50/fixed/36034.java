@java.lang.Override
public void run() {
    synchronized(changes) {
        changeHandler = null;
        changes.process(scene);
    }
}