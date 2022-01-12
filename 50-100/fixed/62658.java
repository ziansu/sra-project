@java.lang.Override
public boolean add(E e) {
    synchronized(this) {
        if (((maxSize) >= 0) && ((size()) >= (maxSize))) {
            return false;
        }else {
            return (m.put(e, java.lang.Boolean.TRUE)) == null;
        }
    }
}