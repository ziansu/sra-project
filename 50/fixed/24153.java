public static org.libsmith.anvil.time.Stopwatch start(@javax.annotation.Nonnull
java.lang.CharSequence taskName, @javax.annotation.Nonnull
org.libsmith.anvil.time.TimeSource timeSource) {
    return new org.libsmith.anvil.time.Stopwatch(taskName, timeSource.getTime(), timeSource);
}