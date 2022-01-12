public void merge(X x1, X x2) {
    java.util.Set<X> class1 = equivalenceClasses.get(x1);
    java.util.Set<X> class2 = equivalenceClasses.get(x2);
    java.util.Set<X> merged = (class1 == null) ? new java.util.HashSet<X>(class1) : new java.util.HashSet<X>();
    if (class2 != null)
        merged.addAll(class2);
    
    for (X x3 : merged) {
        equivalenceClasses.put(x3, merged);
    }
}