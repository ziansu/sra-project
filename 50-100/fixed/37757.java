@java.lang.Override
public java.lang.String next() {
    if ((next) == null) {
        throw new java.lang.IllegalStateException();
    }
    prev = next;
    while (iter.hasNext()) {
        next = iter.next();
        if (next.startsWith(prefix)) {
            break;
        }else {
            next = null;
        }
    } 
    if (((next) != null) && (next.equals(prev))) {
        next = null;
    }
    return prev;
}