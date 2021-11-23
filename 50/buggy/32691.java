public boolean RemoveDemons() {
    if ((ListDemons.size()) > 1) {
        ListDemons.remove(((ListDemons.size()) - 1));
        return true;
    }
    return false;
}