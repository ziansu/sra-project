public void increment(@org.jetbrains.annotations.NotNull
java.lang.Throwable throwable) {
    counter.labels(collectorName, localAddress.get(), throwable.getClass().getSimpleName()).inc();
}