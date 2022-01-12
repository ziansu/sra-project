@java.lang.Override
public boolean contains(java.lang.Object candidate) {
    if ((candidate == null) || (!(candidate instanceof java.lang.String)))
        return false;
    
    return innerSet.contains(((java.lang.String) (candidate)).toLowerCase());
}