private int getRegisterOrStackSlot(byte mode) {
    return ((int) ((codeBuffer.get(((ip) + 2))) << 2)) + (mode == (com.thesett.aima.logic.fol.wam.compiler.WAMInstruction.STACK_ADDR) ? (ep) + (3 << 2) : 0);
}