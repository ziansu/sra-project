public final boolean setStatus(jasl.counters.States state) {
    if (!(status().contains(state))) {
        _status ^= state.value();
        if (state == (States.DESPERATE))
            setStatus(States.BROKEN);
        
        return true;
    }
    return false;
}