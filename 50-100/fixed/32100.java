@java.lang.Override
public void run() {
    try {
        com.servoy.j2db.debug.RemoteDebugScriptEngine.debugger.outputStdOut("");
        connected = isSocketValid();
        if ((!(connected)) && ((com.servoy.j2db.debug.RemoteDebugScriptEngine.socket) != null)) {
            com.servoy.j2db.debug.RemoteDebugScriptEngine.debugger = null;
            com.servoy.j2db.debug.RemoteDebugScriptEngine.socket = null;
        }
    } finally {
        synchronized(this) {
            executing = false;
        }
    }
}