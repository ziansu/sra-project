public void registerMethod(java.lang.String identifier, com.blogspot.debukkitsblog.Util.Executable executable) {
    if (!(identifier.equalsIgnoreCase("LOGIN"))) {
        idMethods.put(identifier, executable);
    }else {
        throw new java.lang.IllegalArgumentException(("Identifier may not be 'LOGIN'. " + ("Since v1.0.1 the server automatically registers new clients. " + "To react on new client registed, use the onClientRegisters() Listener by overwriting it.")));
    }
}