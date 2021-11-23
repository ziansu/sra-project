@java.lang.SuppressWarnings(value = "unchecked")
public int compare(T o1, T o2) {
    java.lang.Comparable<java.lang.Object> p1 = ((java.lang.Comparable<java.lang.Object>) (property.getPropertyValue(o1)));
    java.lang.Comparable<java.lang.Object> p2 = ((java.lang.Comparable<java.lang.Object>) (property.getPropertyValue(o2)));
    if (p1 == null)
        return p2 != null ? -1 : 0;
    else
        if (p2 == null)
            return 1;
        
    
    return p1.compareTo(p2);
}