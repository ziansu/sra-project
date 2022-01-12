@java.lang.Override
public boolean equals(java.lang.Object o) {
    if (!(o instanceof commons.model.OrderedPair))
        return false;
    
    commons.model.OrderedPair p = ((commons.model.OrderedPair) (o));
    return ((this.x.intValue()) == (p.x.intValue())) && ((this.y.intValue()) == (p.y.intValue()));
}