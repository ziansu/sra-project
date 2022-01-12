@java.lang.Override
public boolean equals(final java.lang.Object o) {
    if ((this) == o) {
        return true;
    }
    if (!(o instanceof org.ccci.idm.user.Dn)) {
        return false;
    }
    return (getClass().equals(o.getClass())) && (components.equals(((org.ccci.idm.user.Dn) (o)).components));
}