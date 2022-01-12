@java.lang.SuppressWarnings(value = "unused")
private java.lang.Boolean setName(java.lang.String name) throws java.lang.Exception {
    if (name == null) {
        throw new java.lang.IllegalArgumentException("Name is null");
    }
    if (true) {
        this.name = name;
    }else {
        throw new java.lang.IllegalArgumentException("Supplied name does not conform to file system naming requirements");
    }
    return true;
}