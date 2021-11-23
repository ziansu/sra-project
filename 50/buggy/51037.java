@java.lang.Override
public boolean apply(@javax.annotation.Nullable
final T t) {
    if (t != null)
        identifiers.remove(idFunction.apply(t));
    
    return true;
}