@java.lang.Override
protected int compareInternal(java.lang.Object o1, java.lang.Object o2) {
    if ((o1 instanceof util.UniqueID) && (o2 instanceof util.UniqueID))
        return java.lang.Integer.compare(((util.UniqueID) (o1)).getID(), ((util.UniqueID) (o2)).getID());
    
    return o1.toString().compareTo(o2.toString());
}