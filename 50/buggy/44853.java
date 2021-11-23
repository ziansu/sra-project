public boolean tickWorld() throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.InstantiationException, java.lang.reflect.InvocationTargetException {
    isSchematicUpToDate = false;
    return !(rWorld.tick(world, 1L));
}