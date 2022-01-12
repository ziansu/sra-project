@java.lang.Override
@java.lang.SuppressWarnings(value = "unchecked")
public <T> java.util.Optional<T> getContext(org.spongepowered.api.event.cause.EventContextKey<T> key) {
    enforceMainThread();
    com.google.common.base.Preconditions.checkNotNull(key, "key");
    return java.util.Optional.ofNullable(((T) (this.ctx.get(key.getId()))));
}