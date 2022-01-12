public void addComputer(system.Computer computer, space.SpaceImpl space, int jobId) {
    this.jobId = jobId;
    synchronized(this.computerList) {
        this.computerList.add(computer);
    }
    system.ComputerProxy computerProxy = new system.ComputerProxy(space, computer, this.jobId, this.lock);
    computerProxy.startWorker();
}