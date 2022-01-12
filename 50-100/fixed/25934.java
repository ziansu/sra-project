@java.lang.Override
public void execute(cz.cvut.fit.brabepa1.run.interpret.VirtualMachine vm) {
    java.lang.Integer value1 = ((java.lang.Integer) (vm.stackPop()));
    java.lang.Integer value2 = ((java.lang.Integer) (vm.stackPop()));
    if (value2 <= value1) {
        vm.incrementPc();
    }else {
        vm.addOffsetToPc(branchOffset);
    }
}