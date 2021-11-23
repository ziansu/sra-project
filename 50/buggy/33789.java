@java.lang.Override
public E remove(int index) {
    E e = get(index);
    elements[index] = null;
    return e;
}