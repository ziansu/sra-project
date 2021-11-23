public boolean tickWorld() throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.InstantiationException, java.lang.reflect.InvocationTargetException {
    isSchematicUpToDate = false;
    boolean result = !(rWorld.tick(world, 1L));
    return result;
}