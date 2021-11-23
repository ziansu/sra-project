private static java.io.File writeHex(de.neemann.assembler.asm.Program p, java.io.File name) throws de.neemann.assembler.expression.ExpressionException, java.io.IOException {
    if (name != null) {
        java.io.File f = de.neemann.assembler.gui.Main.makeFilename(name, ".asm", ".hex");
        try (java.io.PrintStream ps = new java.io.PrintStream(f, "utf-8")) {
            p.traverse(new de.neemann.assembler.asm.formatter.HexFormatter(ps));
        }
        return f;
    }
    return null;
}