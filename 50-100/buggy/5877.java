@java.lang.Override
public boolean evaluate(java.lang.String value) throws java.lang.Exception {
    if ((lowerBound.isEmpty()) && (upperBound.isEmpty())) {
        return true;
    }
    return ((lowerBound.compareTo(value)) <= 0) && ((upperBound.compareTo(value)) >= 0);
}