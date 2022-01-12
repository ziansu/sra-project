public boolean remove(org.eclipse.californium.core.observe.ObserveRelation relation) {
    if (relation == null)
        throw new java.lang.NullPointerException();
    
    return observeRelations.remove(relation.getKey(), relation);
}