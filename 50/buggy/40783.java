@java.lang.Override
public double nextMetricIncrement() {
    if (!(hasNext())) {
        java.lang.System.err.println("No next increment");
        throw new java.lang.IllegalStateException();
    }
    this.current = (current) + (increment);
    return current;
}