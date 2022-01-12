@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public <T> T[] toArray(T[] a) {
    T[] result = null;
    if ((a.length) >= (this.size()))
        result = a;
    else
        result = ((T[]) (java.lang.reflect.Array.newInstance(a.getClass().getComponentType(), this.size())));
    
    java.lang.System.arraycopy(this.array, this.start, result, 0, result.length);
    return result;
}