@java.lang.Override
public N div(@org.eclipse.jdt.annotation.Nullable
final N n1, @org.eclipse.jdt.annotation.Nullable
final N n2) {
    if (n1 == null)
        return null;
    
    if (n2 == null)
        return null;
    
    return wrapped.div(n1, n2);
}