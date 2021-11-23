public org.LexGrid.LexBIG.serviceHolder.SearchMethodExamples.ResolvedConceptReferencesIteratorWrapper search(java.lang.String scheme, java.lang.String version, java.lang.String matchText, int searchOption, java.lang.String algorithm) throws org.LexGrid.LexBIG.Exceptions.LBException {
    if (scheme == null)
        return null;
    
    java.util.List<java.lang.String> schemes = new java.util.ArrayList<java.lang.String>();
    java.util.List<java.lang.String> versions = new java.util.ArrayList<java.lang.String>();
    schemes.add(scheme);
    versions.add(version);
    return search(schemes, versions, matchText, searchOption, algorithm);
}