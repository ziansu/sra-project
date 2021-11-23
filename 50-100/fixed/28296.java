protected final void set_state_to_done_and_wait_for_stability() throws kilim.Pausable {
    int state_and_mutator_count = try_set_state(erjang.ETask.STATE.DONE);
    int iter_count = 0;
    while ((state_and_mutator_count & (erjang.ETask.MUTATOR_COUNT_MASK)) != 0) {
        if (((++iter_count) % 16) == 0)
            kilim.Task.yield();
        
        state_and_mutator_count = pstate_and_mutator_count.get();
    } 
    assert (pstate_and_mutator_count.get()) == (erjang.ETask.STATE.DONE.ordinal());
}