@java.lang.Override
public <T> T get(java.lang.Object key, java.util.concurrent.Callable<T> valueLoader) {
    try {
        T t = valueLoader.call();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return null;
}