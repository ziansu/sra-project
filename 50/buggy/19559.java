@java.lang.Override
public boolean hasNext() {
    if (((channels.size()) - 1) > (current)) {
        return true;
    }
    return false;
}