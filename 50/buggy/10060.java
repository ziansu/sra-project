public boolean straight() {
    if (inOrder(myCards)) {
        return true;
    }
    return false;
}