@java.lang.Override
public boolean equals(T o1, T o2) {
    if ((o1 == null) && (o2 == null))
        return true;
    
    if ((o1 == null) || (o2 == null))
        return false;
    
    boolean equal = true;
    for (java.util.function.Function f : functions)
        equal = equal & (f.apply(o1).equals(f.apply(o2)));
    
    return false;
}