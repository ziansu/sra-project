@java.lang.Override
public boolean accept(T t) {
    if ((t == null) && ((this.matching) == null)) {
        return true;
    }
    if (t == null) {
        return false;
    }
    return t.equals(matching);
}