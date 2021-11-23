public void putCiteproc(gov.ncbi.pmc.cite.CitationProcessor cp) {
    java.lang.String style = cp.getStyle();
    gov.ncbi.pmc.cite.CiteprocStylePool cpsPool = citeprocStylePools.get(style);
    cpsPool.putCiteproc(cp);
}