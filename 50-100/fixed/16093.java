@java.lang.Override
public void step() {
    if ((pc) < (code.size())) {
        com.iconmaster.source.compile.Operation op = code.get(pc);
        if ((op.op) == (com.iconmaster.source.compile.Operation.OpType.RET)) {
            vm.loadExecutor(creator);
            creator.done = false;
            incPC();
        }else {
            super.step();
            if ((pc) >= (code.size())) {
                endIt();
            }
        }
    }else {
        endIt();
    }
}