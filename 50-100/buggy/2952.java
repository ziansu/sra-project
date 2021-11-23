@java.lang.Override
public boolean hasNext() {
    if ((null == (batch)) || (checkBatchEnd(batch))) {
        if (iterator.hasNext()) {
            batch = iterator.next();
            counter = 0;
        }else {
            return false;
        }
    }
    if (!(checkBatchEnd(batch))) {
        return true;
    }else {
        return false;
    }
}