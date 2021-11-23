private java.lang.String buildEmptyObjectResultEntry(int objectId, int objectState) {
    if ((emptyEntry) == null) {
        final java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < 20; i++)
            sb.append('\t');
        
        sb.append(objectId).append('\t').append(objectState);
        sb.append(gdsc.foci.FindFoci.newLine);
        emptyEntry = sb.toString();
    }
    return emptyEntry;
}