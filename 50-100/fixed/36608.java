@java.lang.Override
public boolean equals(final java.lang.Object object) {
    if (object == null) {
        return false;
    }
    if (object == (this)) {
        return true;
    }
    if ((object.getClass()) != (this.getClass())) {
        return false;
    }
    final de.uka.ipd.sdq.beagle.core.SeffBranch other = ((de.uka.ipd.sdq.beagle.core.SeffBranch) (object));
    return new org.apache.commons.lang3.builder.EqualsBuilder().append(this.branches, other.branches).isEquals();
}