@java.lang.Override
public E remove(int index) {
    (size)--;
    E e = get(index);
    elements[index] = null;
    return e;
}