public void addInterval(N begin, N end, Type data) {
    if ((end.compareTo(begin)) >= 0) {
        inSync = false;
        intervalList.add(new intervalTree.Interval(begin, end, data));
    }else {
        throw new java.lang.IllegalArgumentException("beginning of range must be less than end");
    }
}