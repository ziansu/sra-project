@java.lang.Override
public void scheduleIfNecessary() {
    for (edu.ksu.operatingsystems.javaos.storage.ProcessControlBlock pcb : disk.getProcesses()) {
        if (((!(pcb.inMemory())) && (!(pcb.isFinished()))) && (ram.isRoomForProcess(pcb))) {
            java.lang.System.out.println((("Adding process " + (pcb.getID())) + " to queue from Long Term Scheduler"));
            ram.addProcessControlBlockToMemoryByProcessID(pcb.getID(), disk);
        }
    }
}