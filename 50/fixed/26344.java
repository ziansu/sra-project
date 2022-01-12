@java.lang.Override
public void println(java.lang.String x) {
    if (net.rptools.lib.DebugStream.debugOn) {
        showLocation();
    }
    super.println(x);
}