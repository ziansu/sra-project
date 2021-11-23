@java.lang.Override
public int indexOf(java.lang.Object o) {
    int i = -1;
    if (o == null) {
        for (java.lang.Object item : this) {
            i++;
            if (item == null) {
                return i;
            }
        }
    }else {
        for (java.lang.Object item : this) {
            i++;
            if (o.equals(item)) {
                return i;
            }
        }
    }
    return -1;
}