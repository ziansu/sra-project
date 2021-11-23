public void leaveWork(sim.app.mtrp.main.Agent agent) {
    curWorker = null;
    isAvailable = true;
    countWork = 0;
    unsignal(agent);
}