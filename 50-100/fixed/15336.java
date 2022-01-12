@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if ((o == null) || ((getClass()) != (o.getClass())))
        return false;
    
    io.gravitee.definition.model.Api api = ((io.gravitee.definition.model.Api) (o));
    return java.util.Objects.equals(id, api.id);
}