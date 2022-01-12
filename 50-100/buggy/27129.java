public java.lang.String getId() {
    if ((id) == null) {
        id = (((context.getBundle().getSymbolicName()) + "-") + (DEFAULT_BUS_ID)) + (java.lang.Integer.toString(this.hashCode()));
    }
    return id;
}