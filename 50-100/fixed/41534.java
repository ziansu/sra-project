public nachos.threads.InstructionsGenerator.Operation nextOperation() {
    long currentTime = nachos.threads.Machine.timer().getTime();
    if ((currentTime / (nachos.threads.InstructionsGenerator.oneSecond)) != ((baseTime) / (nachos.threads.InstructionsGenerator.oneSecond))) {
        baseTime = currentTime;
        operations.removeFirst();
    }
    if (operations.isEmpty())
        generateOperation();
    
    return operations.getFirst();
}