public static synchronized <T> T provide(final java.lang.Class<T> clz) {
    io.demor.nuts.lib.eventbus.ListenerBus.addClz(clz);
    if (io.demor.nuts.lib.eventbus.ListenerBus.mMethodProvider.containsKey(clz)) {
        return ((T) (io.demor.nuts.lib.eventbus.ListenerBus.mMethodProvider.get(clz).mProxy));
    }else {
        return null;
    }
}