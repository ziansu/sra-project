public static java.lang.String lType2(java.lang.String line) {
    int i = line.indexOf('r');
    Assembler.rd = Assembler.prettyRegs(i, line);
    Assembler.immediate = Assembler.prettyLarge((i + 4), line.length(), 15, line);
    return ((Assembler.blank) + (Assembler.rd)) + (Assembler.immediate);
}