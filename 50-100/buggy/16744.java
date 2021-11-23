@java.lang.Override
public int hashCode() {
    return new org.apache.commons.lang.builder.HashCodeBuilder(13, 41).appendSuper(this.accLookup.getTypes().hashCode()).append(this.accLookup.getPosition()).append(this.accLookup.getId()).toHashCode();
}