@java.lang.Override
public boolean equals(final java.lang.Object obj) {
    if ((this) == obj) {
        return true;
    }
    if ((obj == null) || ((obj.getClass()) != (this.getClass()))) {
        return false;
    }
    return address.equals(((com.iota.iri.Neighbor) (obj)).address);
}