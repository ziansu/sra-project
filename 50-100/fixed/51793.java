public void throwException(javax.ws.rs.core.Response response) {
    try {
        throw exceptionClass.getConstructor(javax.ws.rs.core.Response.class).newInstance(response);
    } catch (java.lang.InstantiationException | java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.reflect.InvocationTargetException | java.lang.NoSuchMethodException | java.lang.SecurityException e) {
        throw new javax.ws.rs.InternalServerErrorException(response, e);
    }
}