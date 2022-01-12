final org.matsim.core.mobsim.qsim.qnetsimengine.QVehicle removeFirstVehicle() {
    double now = network.simEngine.getMobsim().getSimTimer().getTimeOfDay();
    org.matsim.core.mobsim.qsim.qnetsimengine.QVehicle veh = buffer.poll();
    usedBufferStorageCapacity = (usedBufferStorageCapacity) - (veh.getSizeInEquivalents());
    bufferLastMovedTime = now;
    flowcap_accumulate.timeStep = bufferLastMovedTime;
    return veh;
}