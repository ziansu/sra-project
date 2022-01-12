@java.lang.Override
public void execute(cz.cvut.fit.brabepa1.run.interpret.VirtualMachine vm) {
    java.lang.Integer val1 = ((java.lang.Integer) (vm.stackPop()));
    java.lang.Integer val2 = ((java.lang.Integer) (vm.stackPop()));
    if (val1 < val2) {
        vm.incrementPc();
    }else {
        vm.addOffsetToPc(branchOffset);
    }
}