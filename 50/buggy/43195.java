public intellimate.izou.events.Event tryFire(intellimate.izou.events.EventCallable eventCallable, java.util.function.BiFunction<intellimate.izou.events.Event, java.lang.Integer, java.lang.Boolean> onError) throws intellimate.izou.events.MultipleEventsException {
    return tryFire(eventCallable, onError, null);
}