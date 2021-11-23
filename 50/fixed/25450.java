@java.lang.Override
public final void close(java.lang.Throwable t) {
    actor.die(t);
    close();
}