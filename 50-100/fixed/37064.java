private void handleCloseEvent(org.voltdb.utils.VoltTrace.TraceEvent event) {
    java.io.BufferedWriter bw = m_fileWriters.get(event.getFileName());
    if (bw == null)
        return ;
    
    try {
        bw.newLine();
        bw.write("]");
        bw.newLine();
        bw.close();
    } catch (java.io.IOException e) {
    }
    m_fileWriters.remove(event.getFileName());
}