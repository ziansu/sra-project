@java.lang.Override
public void changed(uk.co.nickthecoder.jguifier.parameter.Parameter source) {
    if ((cmd) != null) {
        cmd.dir(task.directory.getValue());
    }
}