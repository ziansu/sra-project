@java.lang.Override
protected long nexDelay(@org.jetbrains.annotations.NotNull
final java.lang.Integer count, final long delayMillis) {
    return delayMillis * count;
}