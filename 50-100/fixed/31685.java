public boolean addMessage(int e1, int e2) {
    if (!(repOk(e1, e2))) {
        return false;
    }
    if ((messages.get(e1)) == null) {
        messages.put(e1, new java.util.HashSet<java.lang.Integer>());
    }
    messages.get(e1).add(e2);
    return true;
}