public int[] getTopDocs() {
    int[] docs = new int[topCount];
    java.util.Iterator<java.util.Map.Entry<java.lang.Integer, java.lang.Double>> it = this.sortedResults.iterator();
    int i = 0;
    while ((it.hasNext()) && (i < (topCount))) {
        docs[i] = it.next().getKey();
    } 
    return docs;
}