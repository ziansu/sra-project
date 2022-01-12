@java.lang.Override
public void visit(edu.kit.ipd.pp.minijavac.codegen.Mul mul) {
    masm.comment(mul.toString());
    masm.load(Register.rax, FrameSlot(mul.getLeft()));
    masm.load(Register.rbx, FrameSlot(mul.getRight()));
    masm.mul(Register.rbx);
    masm.store(FrameSlot(mul), Register.rax);
}