private void moveToNext() {
    int i = 0;
    while ((i < (currTupleIndexes.size())) && (currTupleIndexes.get(i).equals(tupleIndexesLimits.get(i)))) {
        currTupleIndexes.set(i, 0);
        i++;
    } 
    if (i == (currTupleIndexes.size()))
        hasNext = false;
    else
        currTupleIndexes.set(i, ((currTupleIndexes.get(i)) + 1));
    
}