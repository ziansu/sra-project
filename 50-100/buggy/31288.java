public void findClones(java.util.HashSet<java.lang.String> inputTerms) {
    java.util.HashSet<java.lang.String> matchGroupTerms = dumpTerms();
    boolean allExist = true;
    for (java.lang.String term : inputTerms) {
        if ((matchGroupTerms.contains(term)) == false) {
            allExist = false;
            break;
        }
    }
    if (allExist) {
        mapCode2Comment();
        printAllMappings(true, 1);
    }
}