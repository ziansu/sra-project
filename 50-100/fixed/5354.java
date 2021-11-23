@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if ((o == null) || ((getClass()) != (o.getClass())))
        return false;
    
    es.estheraf.horariosbus.data.model.Stop stop = ((es.estheraf.horariosbus.data.model.Stop) (o));
    return id.equals(stop.id);
}