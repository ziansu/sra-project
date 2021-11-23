public org.ektorp.ViewQuery key(java.lang.Object o) {
    reset();
    try {
        key = mapper.writeValueAsString(o);
    } catch (java.lang.Exception e) {
        throw org.ektorp.Exceptions.propagate(e);
    }
    return this;
}