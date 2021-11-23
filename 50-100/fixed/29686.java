public void doDeallocate() {
    int randIndex = random.nextInt(memoryManager.getMemoryBlocks().size());
    while (!(memoryManager.getMemoryBlocks().get(randIndex).isProcess())) {
        randIndex++;
        if (randIndex >= (memoryManager.getMemoryBlocks().size()))
            randIndex = 0;
        
    } 
    int procID = memoryManager.getMemoryBlocks().get(randIndex).getProcessID();
    memoryManager.deallocateMemory(procID);
}