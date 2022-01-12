@java.lang.Override
public void connectionStopped(py4j.Py4JServerConnection arg0) {
    synchronized(getLock()) {
        if ((this.connection) == null)
            logError("connectionStopped error: this.connection already null");
        else
            if ((this.connection) != arg0)
                logError(((("connectionStopped error: this.connection=" + (this.connection)) + " not equal to arg0=") + arg0));
            else {
                hardClose();
            }
        
    }
}