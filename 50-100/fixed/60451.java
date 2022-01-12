private com.cburch.logisim.data.Value getRb(int instruction) {
    int opcode = instruction >> 26;
    if ((((opcode == 15) || ((getIsJump(instruction).toIntValue()) == 1)) || ((getIsImmediate(instruction).toIntValue()) == 1)) || (opcode == 1)) {
        return getValue(0, 5);
    }else {
        int ra = (instruction >> 16) & 31;
        return getValue(ra, 5);
    }
}