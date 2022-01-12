public void addWebHistory(java.lang.StringBuffer buffer) {
    java.util.StringTokenizer line = new java.util.StringTokenizer(buffer.toString(), "|");
    while (line.hasMoreTokens()) {
        java.lang.String token = line.nextToken();
        if ((this.webHistory.indexOf(token)) != (-1)) {
            this.webHistory.add(token);
        }
    } 
}