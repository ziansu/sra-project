@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((o == null) || (!(o.getClass().equals(this.getClass())))) {
        return false;
    }
    org.easymock.internal.Invocation other = ((org.easymock.internal.Invocation) (o));
    return (((this.mock) == (other.mock)) && (this.method.equals(other.method))) && (this.equalArguments(other.arguments));
}