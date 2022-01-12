private void evalPossible() {
    while (!(_deq.isEmpty())) {
        int look = _deq.getTail();
        if (isBranch(look)) {
            _deq.pushFront(next1[look]);
            _deq.pushFront(next2[look]);
        }else {
            _deq.pushFront(next1[look]);
        }
    } 
    if ((_deq.peekHead()) == 0) {
        _failure = true;
        _success = true;
        return ;
    }
}