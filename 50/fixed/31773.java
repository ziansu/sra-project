@java.lang.Override
public final synchronized int incrementInt(final java.lang.String key, final int amount) {
    int newValue = (opt(key, 0)) + amount;
    put(key, newValue);
    return newValue;
}