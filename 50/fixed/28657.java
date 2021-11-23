@java.lang.Override
public void Prepare() {
    for (IR.Operand x : parameterList) {
        if (x instanceof IR.VirtualRegister) {
            IR.RegisterManager.getID(((IR.VirtualRegister) (x)));
        }
    }
}