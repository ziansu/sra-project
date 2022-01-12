public boolean matches(org.easymock.internal.Invocation actual) {
    return (((this.invocation.getMock()) == (actual.getMock())) && (this.invocation.getMethod().equals(actual.getMethod()))) && (matches(actual.getArguments()));
}