protected void dbg(net.xqhs.util.logging.Debug.DebugItem debug, java.lang.String message, java.lang.Object... arguments) {
    if (debug.toBool())
        lf(message);
    
}