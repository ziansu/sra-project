@java.lang.Override
public int hashCode() {
    if ((this.accLookup) == null)
        return 0;
    
    return new org.apache.commons.lang.builder.HashCodeBuilder(13, 41).appendSuper(this.accLookup.getTypes().hashCode()).append(this.accLookup.getPosition()).append(this.accLookup.getId()).toHashCode();
}