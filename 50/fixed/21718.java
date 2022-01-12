@java.lang.Override
public synchronized boolean ticketsFound() {
    if ((currentLink) == null) {
        return false;
    }
    return !(alreadyChecked.contains(currentLink));
}