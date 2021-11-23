public boolean init() {
    if (!(checkConnection())) {
        return false;
    }
    return true;
}