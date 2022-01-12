@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o) {
        return true;
    }
    if (o instanceof org.javers.core.diff.changetype.PropertyChange) {
        org.javers.core.diff.changetype.PropertyChange that = ((org.javers.core.diff.changetype.PropertyChange) (o));
        return (super.equals(that)) && (java.util.Objects.equals(this.propertyName, that.propertyName));
    }
    return false;
}