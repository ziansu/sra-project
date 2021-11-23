@java.lang.Override
public void visit(double v) {
    isValid = true;
    if (v < (lastV)) {
        (numSortedAsc)++;
    }else
        if (v > (lastV)) {
            (numSortedDesc)++;
        }else {
            (numEqual)++;
        }
    
    lastV = v;
    (n)++;
}