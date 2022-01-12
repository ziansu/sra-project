public void runBatchQueries() {
    sources = new java.util.HashSet<java.lang.String>();
    long starttime = java.lang.System.currentTimeMillis();
    fetchQueries();
    java.lang.System.out.println(queries);
    java.lang.System.out.println(sources);
    fetchSources();
    java.util.Iterator<java.lang.String> itr = sources.iterator();
    while (itr.hasNext())
        processSource(itr.next());
    
    long tt = ((java.lang.System.currentTimeMillis()) - starttime) / 1000;
    java.lang.System.out.println(("Finished: " + tt));
}