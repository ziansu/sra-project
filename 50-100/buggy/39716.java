public org.jowidgets.util.Interval<NUMBER_TYPE> closure(final java.lang.Iterable<org.jowidgets.util.Interval<NUMBER_TYPE>> intervals) {
    if (org.jowidgets.util.EmptyCheck.isEmpty(intervals)) {
        return this;
    }
    org.jowidgets.util.Interval<NUMBER_TYPE> result;
    final java.util.Iterator<org.jowidgets.util.Interval<NUMBER_TYPE>> iterator = intervals.iterator();
    result = iterator.next();
    while (iterator.hasNext()) {
        result = result.closure(iterator.next());
    } 
    return result;
}