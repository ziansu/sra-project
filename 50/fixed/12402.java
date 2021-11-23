@java.lang.Override
public boolean exec(final java.io.File script, final java.util.List<java.lang.String> args, final org.arl.fjage.shell.Shell out) {
    if (isBusy())
        return false;
    
    return execFromFile(script, args, out);
}