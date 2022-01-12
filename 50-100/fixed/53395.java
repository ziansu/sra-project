public static void main(java.lang.String[] args) {
    java.lang.String fileName = ((args.length) != 0) ? args[0] : null;
    java.util.List<java.lang.String> translatedOutput;
    try {
        Assembler.validateInput(fileName);
        Assembler.buildSymbolTable(fileName);
        translatedOutput = Assembler.translateAsmToBinary(fileName);
    } catch (java.lang.IllegalArgumentException e) {
        java.lang.System.out.println(e.getMessage());
        return ;
    }
    Assembler.writeOutputFile(fileName.replace(".asm", ".hack"), translatedOutput);
}