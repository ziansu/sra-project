@java.lang.Override
public void scheduleIfNecessary() {
    for (edu.ksu.operatingsystems.javaos.storage.ProcessControlBlock pcb : disk.getProcesses()) {
        if (((!(pcb.inMemory())) && (!(pcb.isFinished()))) && (ram.isRoomForProcess(pcb))) {
            ram.addProcessControlBlockToMemoryByProcessID(pcb.getID(), disk);
        }
    }
}