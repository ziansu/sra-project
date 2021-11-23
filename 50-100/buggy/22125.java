public final boolean canKill() {
    if ((m_status) != (ca.uqac.lif.parkbench.Experiment.Status.RUNNING)) {
        return false;
    }
    long cur_time = (java.lang.System.currentTimeMillis()) / 1000;
    if ((cur_time - (m_startTime)) > (m_killAfter)) {
        return true;
    }
    return false;
}