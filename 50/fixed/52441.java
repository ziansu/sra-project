@java.lang.Override
public void signal(io.termd.core.tty.Signal signal) {
    updateSize(env);
}