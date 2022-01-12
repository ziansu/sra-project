public static context.Context initContext(java.lang.String roomName, java.io.InputStream file) {
    tsen.TsenUniverse universe = new tsen.TsenUniverse();
    ContextUtility.ContextMethod.createRoom(universe.dimension(0), roomName);
    return new context.Context(universe, file);
}