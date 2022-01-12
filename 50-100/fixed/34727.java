@java.lang.Override
public java.lang.Object visit(IC.AST.LocalVariable localVariable) {
    if (localVariable.hasInitValue()) {
        localVariable.getInitValue().accept(this);
        instructions.add(new IC.lir.MoveInstr(registers.request(target), new IC.lir.Memory(localVariable.getName())));
        (target)++;
    }
    return null;
}