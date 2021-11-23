private java.lang.String processNoun(java.lang.String sumokbname, java.lang.String mixedCase, java.lang.String input, java.lang.String synset, java.lang.String params) {
    java.lang.String regular = null;
    java.util.HashSet<java.lang.String> synsetBlock = null;
    regular = nounRootForm(mixedCase, input);
    if (regular != null) {
        synsetBlock = nounSynsetHash.get(regular);
        return sumoDisplay(synsetBlock, mixedCase, "noun", sumokbname, synset, params);
    }else
        return ("<P>There are no associated SUMO terms for the noun \"" + mixedCase) + "\".<P>\n";
    
}