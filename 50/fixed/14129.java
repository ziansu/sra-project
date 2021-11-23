public java.lang.String backTrace(java.lang.String name) {
    name = ("/" + (this.name)) + name;
    if ((parent) != null) {
        name = parent.backTrace(name);
    }
    return name;
}