private simulizer.simulation.cpu.components.CPU createCPU(java.lang.String myInstructions) throws simulizer.simulation.exceptions.DecodeException, simulizer.simulation.exceptions.ExecuteException, simulizer.simulation.exceptions.HeapException, simulizer.simulation.exceptions.InstructionException, simulizer.simulation.exceptions.MemoryException, simulizer.simulation.exceptions.StackException {
    simulizer.simulation.cpu.components.CPU cpu = new simulizer.simulation.cpu.components.CPU(io);
    cpu.setCycleFreq(0);
    cpu.loadProgram(this.createProgram(myInstructions));
    cpu.runProgram();
    cpu.shutdown();
    return cpu;
}