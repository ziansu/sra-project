@java.lang.Override
public void close() throws org.scribble.main.ScribbleRuntimeException {
    this.ep.close();
    if (!(this.ep.isCompleted())) {
        throw new org.scribble.main.ScribbleRuntimeException(("Session not completed: " + (this.ep.self)));
    }
}