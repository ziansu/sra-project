@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (obj == null) {
        return false;
    }
    if (!(obj instanceof org.datacleaner.reference.AbstractReferenceData)) {
        return false;
    }
    final org.datacleaner.reference.AbstractReferenceData other = ((org.datacleaner.reference.AbstractReferenceData) (obj));
    return (java.util.Objects.equals(getClass(), other.getClass())) && (java.util.Objects.equals(getName(), other.getName()));
}