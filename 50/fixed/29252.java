@java.lang.Override
public E next() {
    com.googlecode.objectify.Ref<E> ref = this.wrapped.next();
    return null != ref ? ref.get() : null;
}