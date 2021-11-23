java.lang.String nextToken() throws java.lang.Exception {
    while (((this.st) == null) || (!(this.st.hasMoreElements()))) {
        this.st = new java.util.StringTokenizer(this.br.readLine());
    } 
    return this.st.nextToken();
}