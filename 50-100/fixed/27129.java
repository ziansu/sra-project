@java.lang.Override
public java.lang.String getId() {
    if ((id) == null) {
        if ((context) == null) {
            id = super.getId();
        }else {
            id = (((context.getBundle().getSymbolicName()) + "-") + (DEFAULT_BUS_ID)) + (java.lang.Integer.toString(this.hashCode()));
        }
    }
    return id;
}