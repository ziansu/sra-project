public void run(java.lang.String key) {
    java.util.Objects.requireNonNull(key);
    com.diffplug.common.debug.ManualExecutor.QueuedExecutor value = map.remove(key);
    java.util.Objects.requireNonNull(value, "Can only call run() once per key!");
    value.unblock();
}