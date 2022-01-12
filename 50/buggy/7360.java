public static void parse(java.lang.String line) {
    if (line.contains(":")) {
        Assembler.isLabel(line);
    }else {
        Assembler.moreParse(line);
    }
    Assembler.address += 4;
}