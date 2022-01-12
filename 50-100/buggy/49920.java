private java.lang.String processAdjective(java.lang.String sumokbname, java.lang.String mixedCase, java.lang.String input, java.lang.String synset, java.lang.String params) {
    java.lang.StringBuffer result = new java.lang.StringBuffer();
    java.lang.String synsetBlock;
    synsetBlock = adjectiveSynsetHash.get(input);
    result.append(sumoDisplay(synsetBlock, mixedCase, "adjective", sumokbname, synset, params));
    return result.toString();
}