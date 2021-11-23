public org.sbolstack.frontend.Sequence fetchSequence(java.lang.String storeName, java.net.URI sequenceUri) throws org.sbolstack.frontend.StackException {
    java.lang.String url = ((((backendUrl) + (storeUriFragment(storeName))) + "/sequence/") + (encodeUri(sequenceUri))) + "/sbol";
    org.sbolstack.frontend.TopLevel topLevel = fetchTopLevel(url, sequenceUri);
    if (!(topLevel instanceof org.sbolstack.frontend.Sequence))
        throw new org.sbolstack.frontend.StackException(("Expected Sequence, found " + (topLevel.getClass().getName())));
    
    return ((org.sbolstack.frontend.Sequence) (topLevel));
}