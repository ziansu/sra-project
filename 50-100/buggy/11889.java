@java.lang.Override
protected boolean matchesSafely(T item) {
    T startOfWindow = ((T) (other.minus(window, units)));
    T endOfWindow = ((T) (other.plus(window, units)));
    return ((startOfWindow.compareTo(other)) <= 0) && ((endOfWindow.compareTo(other)) >= 0);
}