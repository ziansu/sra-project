static final com.fragmentime.markdownj.elements.Element LoadResourceFromClass(java.lang.Class c, java.lang.String resource) throws java.io.IOException {
    com.fragmentime.markdownj.elements.Element e = new com.fragmentime.markdownj.elements.Element();
    try (java.io.InputStream is = c.getResourceAsStream("/test-block.md");java.io.InputStreamReader isr = new java.io.InputStreamReader(is);java.io.BufferedReader br = new java.io.BufferedReader(isr)) {
        java.lang.String tmp = null;
        while ((tmp = br.readLine()) != null) {
            e.append(tmp);
        } 
    }
    return e;
}