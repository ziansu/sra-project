@java.lang.Override
public java.util.Set<java.lang.Integer> getLastPos() {
    if ((lastPos) != null)
        return lastPos;
    
    lastPos = new java.util.HashSet(t2.getLastPos());
    if (t2.isNullable())
        lastPos.addAll(t1.getLastPos());
    
    return lastPos;
}