@java.lang.Override
public boolean hasNext() {
    if (!(peekingIterator.hasNext())) {
        return false;
    }
    denominator.ultradns.model.DirectionalRecord record = peekingIterator.peek();
    if (record.isNoResponseRecord()) {
        peekingIterator.next();
    }
    return true;
}