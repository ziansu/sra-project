@java.lang.Override
public boolean hasNext() {
    if (((village[((index) + 1)]) == null) || (((village.length) - 1) == (index))) {
        return false;
    }
    return true;
}