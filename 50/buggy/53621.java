public void initialize(java.lang.String[] args) {
    super.initialize(args);
    nachos.vm.VMKernel.invTable = new nachos.vm.VMKernel.PhysicalPage[nachos.vm.Machine.processor().getNumPhysPages()];
    nachos.vm.VMKernel.swapFile = ThreadedKernel.fileSystem.open("swap.nachos");
}