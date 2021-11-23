private void notifyListener(java.util.function.Consumer<T> consumer, T value) {
    try {
        consumer.accept(value);
    } catch (java.lang.Throwable t) {
    }
}