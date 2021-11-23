@java.lang.Override
public java.lang.String toString() {
    java.lang.String msg = "null";
    try {
        msg = "{" + (this.keys.get(0));
        for (int i = 1; i < (this.keys.size()); i++)
            msg += ", " + (this.keys.get(i));
        
        msg += "}";
    } catch (java.lang.NullPointerException ex) {
        datastructures.KeyJoint.LOG.log(java.util.logging.Level.INFO, ex.getMessage(), ex);
    }
    return msg;
}