private simulator.ProcessControlBlock dispatch() {
    simulator.ProcessControlBlockImpl prev_process = ((simulator.ProcessControlBlockImpl) (simulator.Config.getCPU().getCurrentProcess()));
    simulator.ProcessControlBlockImpl next_process;
    if (!(readyQueue.isEmpty())) {
        next_process = ((simulator.ProcessControlBlockImpl) (readyQueue.poll()));
        next_process.setState(simulator.READY);
        simulator.Config.getCPU().contextSwitch(next_process);
    }else {
        simulator.Config.getCPU().contextSwitch(null);
    }
    return prev_process;
}