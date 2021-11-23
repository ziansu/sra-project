public void backTrace(java.lang.String name) {
    name = ("/" + (this.name)) + name;
    if ((parent) != null) {
        parent.backTrace(name);
    }
}