private java.lang.String getAnyUrl() {
    final java.util.List<java.lang.String> sources = new java.util.ArrayList<java.lang.String>(urls);
    if (sources.isEmpty()) {
        throw new java.lang.RuntimeException("Unable to get connection: there is no enabled urls");
    }
    final int idx = (rnd.nextInt()) % (sources.size());
    return sources.get(idx);
}