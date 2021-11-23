@java.lang.Override
public boolean shouldChange() {
    return ((java.lang.System.nanoTime()) - (startTime)) > (duration);
}