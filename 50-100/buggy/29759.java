@java.lang.Override
public boolean containsAll(java.util.Collection<?> c) {
    java.util.Iterator it = c.iterator();
    while (it.hasNext()) {
        if (!(contains(it.next()))) {
            return false;
        }
    } 
    return true;
}