public java.util.ArrayList<java.lang.String> getLines(java.lang.String resource) {
    java.io.InputStreamReader isr = new java.io.InputStreamReader(this.getClass().getResourceAsStream(resource));
    java.util.Scanner s = new java.util.Scanner(isr);
    java.util.ArrayList<java.lang.String> lines = new java.util.ArrayList<java.lang.String>();
    while (s.hasNext()) {
        lines.add(s.next());
    } 
    s.close();
    return lines;
}