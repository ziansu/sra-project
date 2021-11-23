@java.lang.SuppressWarnings(value = "unchecked")
public static <T> T createInstance(java.lang.Class<?> clazz) {
    try {
        if (clazz == null) {
            return null;
        }else {
            return ((T) (clazz.newInstance()));
        }
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(("Error occured during creating instance of " + clazz), e);
    }
}