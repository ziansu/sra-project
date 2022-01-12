private java.lang.Object unflattenList(java.lang.String paramName, java.util.List<?> value, java.lang.reflect.Type type, org.kurento.client.internal.transport.serialization.ObjectRefsManager manager) {
    java.util.List<java.lang.Object> list = new java.util.ArrayList<>();
    int counter = 0;
    if (value != null) {
        for (java.lang.Object object : value) {
            list.add(unflattenValue((((paramName + "[") + counter) + "]"), object.getClass(), object, manager));
            counter++;
        }
    }
    return list;
}