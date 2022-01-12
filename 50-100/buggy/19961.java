@java.lang.Override
public void reset() {
    synchronized(lock) {
        io.ghostactive.arctic.core.argument.Arguments.checkState((((this.state) != (io.arctic.processing.ProcessState.RUNNING)) && ((this.state) == (io.arctic.processing.ProcessState.WAITING))), "The module can't be reset. It's actually running.");
        this.state = io.arctic.processing.ProcessState.READY;
    }
}