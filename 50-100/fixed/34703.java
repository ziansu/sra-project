public final boolean clearStatus(jasl.counters.States state) {
    if (((_status) & (state.value())) > 0) {
        if (((States.BROKEN) == state) && (((_status) & (States.DESPERATE.value())) > 0)) {
            return false;
        }
        _status &= ~(state.value());
        return true;
    }
    return false;
}