public java.util.List<Type> get(N start, N end) {
    if ((start.compareTo(end)) > 0) {
        throw new java.lang.IllegalArgumentException("beginning of range must be less than end");
    }
    build();
    java.util.List<intervalTree.Interval<N, Type>> intervals = getIntervals(start, end);
    java.util.List<Type> result = new java.util.ArrayList<>();
    for (intervalTree.Interval<N, Type> interval : intervals)
        result.add(interval.getData());
    
    return result;
}