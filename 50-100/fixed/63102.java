private int indexOf(java.lang.Object o, int x) {
    if (java.util.Objects.equals(val, o))
        return x;
    else
        if (isLast())
            return -1;
        
    
    return tail.indexOf(o, (x + 1));
}