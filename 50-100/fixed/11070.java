@java.lang.Override
public boolean hasNext() {
    if (!(peekingIterator.hasNext())) {
        return false;
    }
    denominator.ultradns.model.DirectionalRecord record;
    while (true) {
        if (peekingIterator.hasNext()) {
            record = peekingIterator.peek();
            if (record.isNoResponseRecord()) {
                peekingIterator.next();
            }else {
                return true;
            }
        }else {
            return false;
        }
    } 
}