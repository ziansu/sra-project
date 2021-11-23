@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if ((o == null) || ((getClass()) != (o.getClass())))
        return false;
    
    cz.tomkren.fishtron.types.TypeVar typeVar = ((cz.tomkren.fishtron.types.TypeVar) (o));
    if ((id) != (typeVar.id))
        return false;
    
    return true;
}