@java.lang.Override
public java.lang.String next() {
    if ((next) == null) {
        throw new java.lang.IllegalStateException();
    }
    java.lang.String prev = next;
    while (iter.hasNext()) {
        next = iter.next();
        if (next.startsWith(prefix)) {
            break;
        }else {
            next = null;
        }
    } 
    return prev;
}