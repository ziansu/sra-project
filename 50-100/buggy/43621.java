public void exitScope() {
    java.lang.System.out.println("Exiting scope:");
    if ((scopes.size()) == 0) {
        throw new java.lang.RuntimeException("No scope to exit");
    }
    scopes.removeElementAt(((scopes.size()) - 1));
    if ((scopes.size()) > 0) {
        hash = scopes.elementAt(((scopes.size()) - 1));
    }else {
        hash = null;
    }
    java.lang.System.out.println(scopes);
}