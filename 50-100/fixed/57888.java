private boolean removeFromValueToHolderMap(final java.lang.Object value, final org.eclipse.emf.ecore.EObject holder) throws java.lang.IllegalStateException {
    org.eclipse.viatra.query.runtime.matchers.util.IMultiset<org.eclipse.emf.ecore.EObject> holders = valueToHolderMap.get(value);
    if (holders == null)
        throw new java.lang.IllegalStateException();
    
    boolean changed = holders.removeOne(holder);
    if (changed) {
        if (holders.isEmpty())
            valueToHolderMap.remove(value);
        
    }
    return changed;
}