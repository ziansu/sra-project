public void check(java.util.Set<com.pololanguage.ninedragongo.Chain> found, com.pololanguage.ninedragongo.BoxCoords coords, java.lang.Object criterion) {
    if ((taken(coords)) && ((filled.get(coords).getColor()) == criterion)) {
        found.add(filled.get(coords));
    }
}