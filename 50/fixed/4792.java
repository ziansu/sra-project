public double getRelevance(java.lang.String url) {
    if ((map.get(url)) == null) {
        return 0;
    }
    return ((double) (map.get(url)));
}