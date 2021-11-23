public E next() {
    throw org.whole.lang.exceptions.IWholeRuntimeException.withCause(new java.util.NoSuchElementException(failure.toString()), org.whole.lang.exceptions.IWholeRuntimeException.asWholeException(failure, org.whole.lang.iterators.FailureIterator.getSourceEntity(), null));
}