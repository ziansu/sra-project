@java.lang.Override
public boolean shouldChange() {
    return ((startTime) - (java.lang.System.nanoTime())) > (duration);
}