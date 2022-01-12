@java.lang.Override
public boolean addAll(java.util.Collection c) {
    if ((c.size()) == 0) {
        return false;
    }
    for (java.lang.Object o : c) {
        this.add(o);
    }
    return true;
}