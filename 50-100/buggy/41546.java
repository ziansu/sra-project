public int distance(java.lang.String nounA, java.lang.String nounB) {
    if ((!(isNoun(nounA))) || (!(isNoun(nounB))))
        throw new java.lang.IllegalArgumentException();
    
    int dis = sap.length(nouns.get(nounA), nouns.get(nounB));
    if (dis == (-1))
        throw new java.lang.IllegalArgumentException();
    
    return dis;
}