@java.lang.Override
public void lock() {
    while (!(this.lockState.compareAndSet(0, 1))) {
    } 
}