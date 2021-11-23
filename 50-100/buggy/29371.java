public int compare(T o1, T o2) {
    java.lang.Comparable p1 = ((java.lang.Comparable) (property.getPropertyValue(o1)));
    java.lang.Comparable p2 = ((java.lang.Comparable) (property.getPropertyValue(o2)));
    if (p1 == null)
        return p2 != null ? -1 : 0;
    else
        if (p2 == null)
            return 1;
        
    
    return p1.compareTo(p2);
}