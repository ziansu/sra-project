public final boolean setStatus(jasl.counters.States state) {
    if (0 == ((_status) & (state.value()))) {
        _status ^= state.value();
        if ((States.DESPERATE) == state)
            setStatus(States.BROKEN);
        
        return true;
    }
    return false;
}