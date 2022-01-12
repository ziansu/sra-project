@java.lang.Override
public boolean hasNext() {
    if (isEmpty()) {
        return false;
    }
    if ((lastPolled) != null) {
        if ((((lastPolled) == (second)) && ((second.plug) == null)) && ((third.plug) == null)) {
            return false;
        }
        return !(((lastPolled) == (third)) && ((third.plug) == null));
    }else {
        return false;
    }
}