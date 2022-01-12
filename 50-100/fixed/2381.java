@java.lang.Override
public boolean retainAll(com.kongmy.ds.p5.MyList<E> otherList) {
    boolean changed = false;
    ThisListLoop : for (int i = 0; i < (size()); i++) {
        OtherListLoop : for (E object : otherList) {
            if (get(i).equals(object)) {
                continue ThisListLoop;
            }
        }
        remove(i);
        i--;
        changed = true;
    }
    return changed;
}