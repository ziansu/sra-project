private void prepareNext() {
    if (!(nextPrepared)) {
        hasNext = false;
        if ((null != (currentIterator)) && (currentIterator.hasNext())) {
            hasNext = true;
        }else {
            while ((!(hasNext)) && (iterators.hasNext())) {
                currentIterator = iterators.next();
                hasNext = currentIterator.hasNext();
            } 
        }
        nextPrepared = true;
    }
}