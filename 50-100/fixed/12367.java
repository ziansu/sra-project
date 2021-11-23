@java.lang.Override
public java.lang.String parse(java.lang.String[] parts) {
    java.lang.String opcode = instructionCodes.get(parts[0]);
    java.lang.String fd = getFloatRegister(parts[1]);
    java.lang.String fs = getFloatRegister(parts[2]);
    java.lang.String ft = getFloatRegister(parts[3]);
    java.lang.String format = "10000";
    java.lang.String funct = "000000";
    return ((((opcode + format) + ft) + fs) + fd) + funct;
}