public void putValue(org.openda.application.gui.Source source, java.lang.String id, java.lang.Object result, org.openda.application.gui.OutputLevel outputLevel, java.lang.String context, int iteration) {
    if (!(writeResults)) {
        return ;
    }
    synchronized(this) {
        java.lang.String display = ((id + " (iteration=") + iteration) + "):\n";
        display += ((id + "= ") + (printObject(result))) + "\n";
        resultDisplayer.append(display);
        setCursorToEnd(this.resultDisplayer);
    }
}