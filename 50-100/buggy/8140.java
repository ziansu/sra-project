@java.lang.Override
public int compare(com.jwetherell.algorithms.data_structures.IntervalTree.IntervalData<?> arg0, com.jwetherell.algorithms.data_structures.IntervalTree.IntervalData<?> arg1) {
    if ((arg0.end) < (arg1.end))
        return -1;
    
    if ((arg1.end) < (arg0.end))
        return 1;
    
    return 0;
}