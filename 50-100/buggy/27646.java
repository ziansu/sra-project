@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if ((o == null) || ((getClass()) != (o.getClass())))
        return false;
    
    io.leao.codecolors.plugin.res.Resource resource = ((io.leao.codecolors.plugin.res.Resource) (o));
    if ((mName) != null ? !(mName.equals(resource.mName)) : (resource.mName) != null)
        return false;
    
    return (mType) == (resource.mType);
}