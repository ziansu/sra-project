@java.lang.Override
public void execute(cz.cvut.fit.brabepa1.run.interpret.VirtualMachine vm) {
    java.lang.Integer value1 = ((java.lang.Integer) (vm.stackPop()));
    java.lang.Integer value2 = ((java.lang.Integer) (vm.stackPop()));
    if (value1 <= value2) {
        vm.incrementPc();
    }else {
        vm.addOffsetToPc(branchOffset);
    }
}