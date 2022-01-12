public void increment(@org.jetbrains.annotations.NotNull
java.lang.Throwable throwable) {
    counter.labels(localAddress.get(), throwable.getClass().getSimpleName()).inc();
}