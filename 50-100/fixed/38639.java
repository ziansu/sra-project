@java.lang.Override
public java.util.List<org.eclipse.egit.github.core.Reference> run(android.accounts.Account account) throws java.lang.Exception {
    java.util.List<org.eclipse.egit.github.core.Reference> allRefs = service.getReferences(repository);
    java.util.Map<java.lang.String, org.eclipse.egit.github.core.Reference> loadedRefs = new java.util.TreeMap<java.lang.String, org.eclipse.egit.github.core.Reference>();
    for (org.eclipse.egit.github.core.Reference ref : allRefs)
        if (com.github.mobile.core.ref.RefUtils.isValid(ref))
            loadedRefs.put(ref.getRef(), ref);
        
    
    refs = loadedRefs;
    return allRefs;
}