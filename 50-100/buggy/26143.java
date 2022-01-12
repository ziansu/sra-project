public void addComputer(system.Computer computer, int computerCount, space.SpaceImpl space, int jobId) {
    this.jobId = jobId;
    this.computerList.put(computerCount, computer);
    system.ComputerProxy computerProxy = new system.ComputerProxy(space, computer, computerCount, this.jobId, this.lock);
    computerProxy.startWorker();
}