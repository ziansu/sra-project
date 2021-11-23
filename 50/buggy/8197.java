public void initialize(java.lang.String[] args) {
    super.initialize(args);
    nachos.vm.VMKernel.pageTable = new nachos.vm.HashMap<java.lang.Integer, nachos.vm.HashMap<java.lang.Integer, nachos.vm.TranslationEntry>>();
}