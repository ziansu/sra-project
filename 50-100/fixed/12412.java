private org.miradi.objecthelpers.ORef getSelectedRef() {
    if ((getPicker().getSelectedHierarchies().length) == 0)
        return org.miradi.objecthelpers.ORef.INVALID;
    
    org.miradi.objecthelpers.ORefList selectedObjectRefs = getPicker().getSelectedHierarchies()[0];
    if ((selectedObjectRefs.size()) == 0)
        return org.miradi.objecthelpers.ORef.INVALID;
    
    org.miradi.objecthelpers.ORef selectedObjectRef = selectedObjectRefs.get(0);
    if (selectedObjectRef.isInvalid())
        return org.miradi.objecthelpers.ORef.INVALID;
    
    return selectedObjectRef;
}