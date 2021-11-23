public J removeLast() {
    if (isEmpty()) {
        java.lang.System.out.println("nothing to remove");
        return null;
    }else {
        _end = _end.getPrev();
        _end.setNext(null);
        return _end.getCargo();
    }
}