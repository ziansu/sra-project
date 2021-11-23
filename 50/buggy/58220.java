@java.lang.Override
public void close() throws org.scribble.main.ScribbleRuntimeException {
    if (!(this.ep.isCompleted())) {
        this.ep.close();
        throw new org.scribble.main.ScribbleRuntimeException(("Session not completed: " + (this.ep.self)));
    }
}