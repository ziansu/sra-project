public static synchronized <T> T provide(final java.lang.Class<T> clz) {
    if (io.demor.nuts.lib.eventbus.ListenerBus.mMethodProvider.containsKey(clz)) {
        return ((T) (io.demor.nuts.lib.eventbus.ListenerBus.mMethodProvider.get(clz).mProxy));
    }else {
        return io.demor.nuts.lib.eventbus.ListenerBus.addClz(clz).mProxy;
    }
}