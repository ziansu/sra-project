@java.lang.Override
public boolean hasNext() {
    if ((null == (batch)) || (checkIfBatchIsProcessedCompletely(batch))) {
        if (detailRawQueryResultIterator.hasNext()) {
            batch = detailRawQueryResultIterator.next();
            counter = 0;
        }else {
            return false;
        }
    }
    if (!(checkIfBatchIsProcessedCompletely(batch))) {
        return true;
    }else {
        return false;
    }
}