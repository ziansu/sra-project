public void addStatusLines(org.apache.http.StatusLine statusLine) {
    if ((this.statusLines) == null)
        this.statusLines = new java.util.ArrayList<org.apache.http.StatusLine>();
    
    synchronized(statusLines) {
        this.statusLines.add(statusLine);
    }
}