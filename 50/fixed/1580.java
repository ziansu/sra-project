@java.lang.Override
public void handle_backout_exception(RalphExceptions.BackoutException be) throws RalphExceptions.BackoutException {
    _lock();
    boolean should_reraise = (atomic_reference_counts) != 0;
    _unlock();
    if (should_reraise)
        throw be;
    else
        put_exception(be);
    
}