@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public synchronized void deserializeLocals(byte[] bytes) {
    locals = ((java.util.Map<java.lang.String, java.io.Serializable>) (org.rapidoid.util.UTILS.deserialize(bytes)));
}