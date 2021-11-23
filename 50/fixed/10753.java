@java.lang.Override
public boolean hasNext() {
    if (((metricType) == null) || ((java.lang.Double.compare(((current) - (increment)), upLimit)) >= 0)) {
        return false;
    }
    return true;
}