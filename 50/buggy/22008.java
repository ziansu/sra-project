public J removeLast() {
    if (isEmpty()) {
        java.lang.System.out.println("nothing to remove");
        return null;
    }else {
        _end = _end.getPrev();
        return _end.setNext(null).getCargo();
    }
}