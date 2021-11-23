public void exitScope() {
    if ((scopes.size()) == 0) {
        throw new java.lang.RuntimeException("No scope to exit");
    }
    scopes.removeElementAt(((scopes.size()) - 1));
    if ((scopes.size()) > 0) {
        hash = scopes.elementAt(((scopes.size()) - 1));
    }else {
        hash = null;
    }
}