public static java.lang.Class getGenericType(java.lang.Class clazz) {
    java.lang.reflect.Type[] genericInterfaces = clazz.getGenericInterfaces();
    for (java.lang.reflect.Type genericInterface : genericInterfaces) {
        if (genericInterface instanceof java.lang.reflect.ParameterizedType) {
            java.lang.reflect.Type[] genericTypes = ((java.lang.reflect.ParameterizedType) (genericInterface)).getActualTypeArguments();
            if ((genericTypes.length) > 0) {
                return ((java.lang.Class) (genericTypes[0]));
            }
        }
    }
    return null;
}