private boolean isNotNullOnObject(java.lang.reflect.Field field, java.lang.Object object) {
    try {
        field.setAccessible(true);
        java.lang.Object o = field.get(object);
        return (o != null) && (!(isEmptyArray(o)));
    } catch (java.lang.IllegalAccessException e) {
        it.sijmen.jump.actors.UpdateActor.LOGGER.error("No access to field {} while checking {}", field, object, e);
        throw new javax.ws.rs.InternalServerErrorException();
    }
}