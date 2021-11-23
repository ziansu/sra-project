public boolean isProtHandlerEnabled(java.lang.String name) {
    if (enabledProtHandlers.get()[0].equals("*")) {
        return true;
    }
    for (java.lang.String n : enabledProtHandlers.get()) {
        if (n.equals(name)) {
            return true;
        }
    }
    return false;
}