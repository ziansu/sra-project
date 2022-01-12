private void doStart(data.Instruction instructie, int klok) {
    java.lang.Process process = new java.lang.Process(instructie.getPid(), sizeVirtual);
    ram.addProcess(process);
    processList.addProcess(process);
    process.setLastAccesTime(klok);
}