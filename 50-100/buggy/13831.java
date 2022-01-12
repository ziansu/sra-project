public void run() {
    while ((pageRefs) < 100) {
        mem.requestPage(getPageToRequest());
        (pageRefs)++;
    } 
    stats.add(mem.getPageHits());
    java.lang.System.out.println(("Page hit ratio: " + ((mem.getPageHits()) / 100.0)));
}