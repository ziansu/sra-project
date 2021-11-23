@java.lang.Override
public int compare(nl.mpcjanssen.simpletask.task.Task a, nl.mpcjanssen.simpletask.task.Task b) {
    if (a == null)
        return 1;
    
    if (b == null)
        return -1;
    
    int completeA = (a.isCompleted()) ? 1 : 0;
    int completeB = (b.isCompleted()) ? 1 : 0;
    return completeA - completeB;
}