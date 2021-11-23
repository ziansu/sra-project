public void checkLocal() {
    if ((connection) == 1) {
        local = false;
    }
    if (((connection) == (-1)) || ((connection) == 0)) {
        local = true;
    }
}