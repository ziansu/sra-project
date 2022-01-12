@java.lang.Override
public boolean equals(final java.lang.Object o) {
    if ((this) == o) {
        return true;
    }
    if (!(o instanceof org.ccci.idm.user.Dn)) {
        return false;
    }
    final org.ccci.idm.user.Dn dn = ((org.ccci.idm.user.Dn) (o));
    return components.equals(dn.components);
}