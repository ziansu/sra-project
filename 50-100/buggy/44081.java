@java.lang.Override
public org.tros.torgo.CodeFunction getFunction(java.lang.String name) {
    org.tros.torgo.CodeBlock cb = stack.get(0);
    while (cb != null) {
        cb = cb.getParent();
        if (cb.hasFunction(name)) {
            return cb.getFunction(name);
        }
    } 
    return null;
}