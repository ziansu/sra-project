@java.lang.Override
public java.lang.String toString() {
    java.lang.String msg = "null";
    try {
        msg = "{" + (this.keyJoint.get(0));
        for (int i = 1; i < (this.keyJoint.size()); i++)
            msg += ", " + (this.keyJoint.get(i));
        
        msg += "}";
    } catch (java.lang.NullPointerException ex) {
        datastructures.KeyJoint.LOG.log(java.util.logging.Level.INFO, ex.getMessage(), ex);
    }
    return msg;
}