public void solve(int iterations) {
    if (isStopped) {
        throw new sk.uniza.fri.hlavna2.diss.monte.carlo.core.exception.MonteCarloStoppedException();
    }
    int i;
    for (i = statistics.getIterationsRunned(); i < ((statistics.getIterationsRunned()) + iterations); i++) {
        if (!(isStopped)) {
            command.simulate(randomStorage);
        }else {
            break;
        }
    }
    statistics.setIterationsRunned(i);
}