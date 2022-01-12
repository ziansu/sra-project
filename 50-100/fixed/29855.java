@java.lang.Override
public void setTime(java.lang.Integer n, long now, long offset) {
    if (hasStateTimeMapping(n)) {
        pcm.state.persistence.State state = scriptMapping.stateTimeMapping.get(n);
        state.apply(scriptMapping.what.get(n), now, offset, java.util.concurrent.TimeUnit.MILLISECONDS);
        state.remember();
    }
    super.setTime(n, now, offset);
}