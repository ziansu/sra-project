public void deleteLine(int index) {
    java.lang.String line = getLineAsString(index);
    _lines.remove(line);
    implicit_invocation.LineStorageChangeEvent event = new implicit_invocation.LineStorageChangeEvent(LineStorageChangeEvent.DELETE, line);
    setChanged();
    notifyObservers(event);
}