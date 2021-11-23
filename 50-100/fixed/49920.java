private java.lang.String processAdjective(java.lang.String sumokbname, java.lang.String mixedCase, java.lang.String input, java.lang.String synset, java.lang.String params) {
    java.lang.StringBuffer result = new java.lang.StringBuffer();
    java.util.HashSet<java.lang.String> synsetBlock = null;
    synsetBlock = adjectiveSynsetHash.get(input);
    result.append(sumoDisplay(synsetBlock, mixedCase, "adjective", sumokbname, synset, params));
    return result.toString();
}