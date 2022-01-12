@java.lang.Override
public void execute() {
    short opCode = parent.getOpCode();
    byte register = ((byte) ((opCode & 3840) >> 8));
    parent.setCpuRegister(register, ((byte) ((parent.getCpuRegister(register)) + ((byte) (opCode)))));
}