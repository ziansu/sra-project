public void nextRow() {
    if (storage.hasNext())
        row = storage.readNextLine().split(seperator);
    else
        row = null;
    
}