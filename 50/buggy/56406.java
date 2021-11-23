private void moveNext() {
    _current = null;
    while ((resultIterator) != null) {
        skipToNext();
        if ((_current) != null) {
            return ;
        }
        super.runQuery();
    } 
}