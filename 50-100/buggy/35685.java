@java.lang.Override
public java.lang.String toString(java.lang.Object msg) {
    if (msg instanceof java.lang.String) {
        return msg.toString();
    }
    try {
        return codec.writeValueAsString(codec);
    } catch (java.io.IOException ex) {
        ctrl.internalOnError(ex);
        return null;
    }
}