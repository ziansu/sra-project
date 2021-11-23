@java.lang.Override
public void visit(double v) {
    isValid = true;
    if ((lastV) < v) {
        (numSortedAsc)++;
    }else
        if ((lastV) > v) {
            (numSortedDesc)++;
        }else {
            (numEqual)++;
        }
    
    lastV = v;
    (n)++;
}