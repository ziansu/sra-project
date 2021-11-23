@java.lang.Override
public void execute() {
    opCode = parent.getOpCode();
    int register = ((opCode) & 3840) >> 8;
    parent.setCpuRegister(register, ((byte) ((parent.getCpuRegister(register)) + ((byte) (opCode)))));
}