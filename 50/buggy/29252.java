@java.lang.Override
public E next() {
    com.googlecode.objectify.Ref<E> ref = this.wrapped.next();
    if (null != ref)
        return ref.get();
    
    return null;
}