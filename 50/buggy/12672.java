@java.lang.Override
public <K, T extends java.io.Serializable> void put(K key, T value) {
    put(key, value, ((int) (java.util.concurrent.TimeUnit.DAYS.toMinutes(30))));
}