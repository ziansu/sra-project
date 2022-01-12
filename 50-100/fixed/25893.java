@java.lang.Override
public org.kframework.backend.java.symbolic.PersistentUniqueList<E> plusAll(int i, java.util.Collection<? extends E> collection) {
    org.kframework.backend.java.symbolic.PersistentUniqueList<E> result = this;
    for (E e : collection) {
        result = result.plus(((i + (result.size())) - (size())), e);
    }
    return result;
}