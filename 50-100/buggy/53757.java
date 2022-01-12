protected int try_set_state(erjang.ETask.STATE new_state) {
    int old_value;
    int new_value;
    int new_state_value = new_state.ordinal();
    do {
        old_value = pstate_and_mutator_count.get();
        int old_state_value = old_value & (erjang.ETask.PSTATE_MASK);
        if (old_state_value >= new_state_value)
            return -1;
        
        new_value = (old_value & (erjang.ETask.MUTATOR_COUNT_MASK)) | new_state_value;
    } while (!(pstate_and_mutator_count.compareAndSet(old_value, new_value)) );
    return old_value;
}