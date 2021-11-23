@java.lang.Override
public boolean equals(java.lang.Object o) {
    commons.model.OrderedPair p;
    try {
        p = ((commons.model.OrderedPair) (o));
    } catch (java.lang.Exception e) {
        return false;
    }
    return ((this.x.intValue()) == (p.x.intValue())) && ((this.y.intValue()) == (p.y.intValue()));
}