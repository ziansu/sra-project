@java.lang.Override
public T create(java.lang.Class<T> clazz) {
    final java.lang.reflect.Constructor<T> constructor = getConstructor(clazz);
    try {
        return constructor.newInstance();
    } catch (java.lang.InstantiationException e) {
        e.printStackTrace();
    } catch (java.lang.reflect.InvocationTargetException e) {
        e.printStackTrace();
    } catch (java.lang.IllegalAccessException e) {
        e.printStackTrace();
    }
    throw new java.lang.IllegalStateException(("Cannot create instance for a class: " + clazz));
}