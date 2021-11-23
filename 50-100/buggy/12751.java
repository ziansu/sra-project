@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if ((o == null) || ((getClass()) != (o.getClass())))
        return false;
    
    me.newyith.fortress.util.BaseUUID that = ((me.newyith.fortress.util.BaseUUID) (o));
    return !((model.uuid) != null ? !(model.uuid.equals(that.getUuid())) : (that.getUuid()) != null);
}