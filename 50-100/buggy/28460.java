private boolean removeFromHolderToValueMap(java.lang.Object value, org.eclipse.emf.ecore.EObject holder) throws java.lang.IllegalStateException {
    org.eclipse.viatra.query.runtime.matchers.util.IMultiset<java.lang.Object> values = holderToValueMap.get(holder);
    boolean changed = values.removeOne(value);
    if (changed) {
        if (values.isEmpty())
            holderToValueMap.remove(holder);
        
    }
    return changed;
}