public ProjetoMetci.metci.VirtualMachine allocateVM(java.util.ArrayList<ProjetoMetci.metci.ComputerServer> computers, ProjetoMetci.metci.VirtualMachine vm) {
    for (ProjetoMetci.metci.ComputerServer computer : computers) {
        if ((((ProjetoMetci.metci.NodePower) (vm.getPower())).compareTo(computer.getRemainingAssets())) < 0) {
            computer.allocatePower(vm.getPower());
            vm.setComputerID(computer.getID());
            return vm;
        }
    }
    return null;
}