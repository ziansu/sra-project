java.lang.String nextToken() throws java.lang.Exception {
    while (((st) == null) || (!(st.hasMoreElements()))) {
        st = new java.util.StringTokenizer(br.readLine());
    } 
    return st.nextToken();
}