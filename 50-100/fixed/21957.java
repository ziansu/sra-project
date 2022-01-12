public <EA extends java.lang.Exception, EN extends java.lang.Exception> com.redthunder.commons.util.handler.ValueHandler<V> take(K key, java.util.function.Supplier<EN> ifNoValue, java.util.function.Supplier<EA> ifAbsent) throws EA, EN {
    com.redthunder.commons.util.handler.MapHandler.throwIfAbsent(map, ifAbsent);
    V value = map.get(key);
    com.redthunder.commons.util.handler.MapHandler.throwIfAbsent(value, ifNoValue);
    return com.redthunder.commons.util.handler.ValueHandler.of(value);
}