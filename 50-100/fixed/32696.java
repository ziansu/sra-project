private java.lang.String processVerb(java.lang.String sumokbname, java.lang.String mixedCase, java.lang.String input, java.lang.String synset, java.lang.String params) {
    java.lang.String regular = null;
    java.util.HashSet<java.lang.String> synsetBlock = null;
    regular = verbRootForm(mixedCase, input);
    java.lang.System.out.println(("INFO in processVerb(): word: " + regular));
    if (regular != null) {
        synsetBlock = verbSynsetHash.get(regular);
        return sumoDisplay(synsetBlock, mixedCase, "verb", sumokbname, synset, params);
    }else
        return ("<P>There are no associated SUMO terms for the verb \"" + mixedCase) + "\".<P>\n";
    
}