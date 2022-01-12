private it.isislab.dmason.experimentals.systemmanagement.worker.WorkerInfo getInfoWorker() {
    it.isislab.dmason.experimentals.systemmanagement.worker.WorkerInfo info = new it.isislab.dmason.experimentals.systemmanagement.worker.WorkerInfo();
    info.setIP(it.isislab.dmason.experimentals.systemmanagement.worker.Worker.WORKER_IP);
    info.setWorkerID(((this.TOPIC_WORKER_ID.hashCode()) + ""));
    info.setNumSlots(this.getSlotsNumber());
    info.setPortCopyLog(PORT_COPY_LOG);
    return info;
}