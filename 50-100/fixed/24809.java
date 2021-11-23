@java.lang.Override
public void runOnce() {
    super.runOnce();
    java.util.List<T> agents = environment.getAllAgents();
    boolean canStop = true;
    int i = 0;
    int size = agents.size();
    T agent;
    while ((i < size) && canStop) {
        agent = agents.get(i);
        if (!(agent.canStopSimulation())) {
            canStop = false;
        }
        i++;
    } 
    terminated = canStop;
}