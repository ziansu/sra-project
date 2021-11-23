@java.lang.SuppressWarnings(value = "unchecked")
public static <T> T resolve(java.lang.Class<T> type) {
    T result = null;
    if (com.mikeliu.common.IoC._objects.containsKey(type)) {
        result = ((T) (com.mikeliu.common.IoC._objects.get(type)));
    }else {
        try {
            result = type.newInstance();
            com.mikeliu.common.IoC._objects.put(type, result);
        } catch (java.lang.InstantiationException e) {
            e.printStackTrace();
        } catch (java.lang.IllegalAccessException e) {
            e.printStackTrace();
        }
    }
    return result;
}