@java.lang.Override
public boolean hasNext() {
    if ((channels.size()) > (current)) {
        return true;
    }
    return false;
}