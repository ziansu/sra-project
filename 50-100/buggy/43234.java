public boolean isProtHandlerEnabled(java.lang.String name) {
    if ((enabledProtHandlers.get()[0]) == "*")
        return true;
    
    for (java.lang.String n : enabledProtHandlers.get()) {
        if (n == name)
            return true;
        
    }
    return false;
}