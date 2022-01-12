@java.lang.Override
public int compareTo(intervalTree.Interval<N, Type> other) {
    int startComparison = start.compareTo(other.getStart());
    int endComparison = end.compareTo(other.getEnd());
    if (startComparison != 0) {
        return startComparison;
    }else {
        return endComparison;
    }
}