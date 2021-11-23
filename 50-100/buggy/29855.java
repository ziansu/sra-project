@java.lang.Override
public void setTime(java.lang.Integer n, java.util.Date date) {
    if (hasStateTimeMapping(n)) {
        pcm.state.persistence.State state = scriptMapping.stateTimeMapping.get(n);
        long now = java.lang.System.currentTimeMillis();
        long duration = (date.getTime()) - now;
        state.apply(scriptMapping.what.get(n), duration, java.util.concurrent.TimeUnit.MILLISECONDS);
        state.remember();
    }
    super.setTime(n, date);
}