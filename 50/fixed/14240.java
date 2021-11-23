@java.lang.Override
public boolean hasNext() {
    if (((village[index]) == null) || ((village.length) == (index))) {
        return false;
    }else {
        return true;
    }
}