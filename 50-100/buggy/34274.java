public void insertLine(java.lang.String[] words, int line) {
    java.util.ArrayList current_line = new java.util.ArrayList();
    for (int i = 0; i < (words.length); i++)
        current_line.add(words[i]);
    
    _lines.add(line, current_line);
    java.lang.String line = getLineAsString(index);
    implicit_invocation.LineStorageChangeEvent event = new implicit_invocation.LineStorageChangeEvent(LineStorageChangeEvent.INSERT, line);
    setChanged();
    notifyObservers(event);
}