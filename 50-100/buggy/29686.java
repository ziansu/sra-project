public void doDeallocate() {
    int randIndex = random.nextInt(memoryManager.getMemoryBlocks().size());
    int procID = memoryManager.getMemoryBlocks().get(randIndex).getProcessID();
    while (!(memoryManager.getMemoryBlocks().get(randIndex).isProcess())) {
        randIndex++;
        if (randIndex >= (memoryManager.getMemoryBlocks().size()))
            randIndex = 0;
        
    } 
    memoryManager.deallocateMemory(procID);
}