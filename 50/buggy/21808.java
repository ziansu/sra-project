public void addAllStatusLines(java.util.List<org.apache.http.StatusLine> statusLine) {
    if ((this.statusLines) == null)
        this.statusLines = new java.util.ArrayList<org.apache.http.StatusLine>();
    
    this.statusLines.addAll(statusLine);
}