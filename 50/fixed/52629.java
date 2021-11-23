public void putMessage(org.openda.interfaces.IInstance source, java.lang.String message) {
    synchronized(this) {
        progressDisplayer.append((message + "\n"));
        setCursorToEnd(this.progressDisplayer);
    }
}