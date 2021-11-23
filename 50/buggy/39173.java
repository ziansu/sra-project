public void addProcess(SimulatedProcess proc) {
    queueList.add(queueList.get(((proc.getPriority()) - 1)));
}