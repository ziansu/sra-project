@java.lang.Override
public boolean hasFunction(java.lang.String name) {
    org.tros.torgo.interpreter.CodeBlock cb = stack.get(0);
    while (cb != null) {
        if (cb.hasFunction(name)) {
            return true;
        }
        cb = cb.getParent();
    } 
    return false;
}