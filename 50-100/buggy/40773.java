protected org.cloudsmith.geppetto.pp.dsl.linking.PPFinder.SearchResult findAttributes(org.eclipse.emf.ecore.EObject scopeDetermeningObject, org.eclipse.xtext.naming.QualifiedName fqn, org.cloudsmith.geppetto.pp.dsl.adapters.PPImportedNamesAdapter importedNames) {
    org.cloudsmith.geppetto.pp.dsl.linking.PPFinder.SearchResult result = null;
    if ((metaCache) == null)
        cacheMetaParameters(scopeDetermeningObject);
    
    org.eclipse.xtext.resource.IEObjectDescription d = metaCache.get(fqn.getLastSegment());
    if (d == null)
        result = findInherited(scopeDetermeningObject, fqn, importedNames, com.google.inject.internal.Lists.<org.eclipse.xtext.naming.QualifiedName>newArrayList(), Match.EQUALS, org.cloudsmith.geppetto.pp.dsl.linking.PPFinder.DEF_AND_TYPE_ARGUMENTS);
    else
        result = new org.cloudsmith.geppetto.pp.dsl.linking.PPFinder.SearchResult(com.google.inject.internal.Lists.newArrayList(d));
    
    return result;
}