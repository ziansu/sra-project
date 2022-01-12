@java.lang.Override
public org.tros.torgo.CodeFunction getFunction(java.lang.String name) {
    org.tros.torgo.CodeBlock cb = stack.get(0);
    while (cb != null) {
        if (cb.hasFunction(name)) {
            return cb.getFunction(name);
        }
        cb = cb.getParent();
    } 
    return null;
}