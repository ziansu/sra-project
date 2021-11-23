@java.lang.Override
public void signal(io.termd.core.tty.Signal signal) {
    java.lang.System.out.println(("GOT SIGNAL " + signal));
    updateSize(env);
}