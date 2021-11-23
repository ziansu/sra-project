@java.lang.Override
public synchronized byte[] serializeLocals() {
    return (locals) != null ? org.rapidoid.util.UTILS.serialize(locals) : null;
}