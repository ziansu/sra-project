public java.lang.String toByteCode(java.lang.String i_assembly) {
    java.util.List<backend.Compiler.asm_line> asm_array = new java.util.ArrayList<backend.Compiler.asm_line>();
    java.lang.String byteCodeReturn = "";
    java.lang.String[] raw_lines = i_assembly.split("\\r?\\n");
    for (int line_i = 0; line_i < (raw_lines.length); line_i++) {
        asm_array.add(asm_line(raw_lines[line_i]));
        byteCodeReturn += asm_array.get(line_i).getByteCode();
    }
    return byteCodeReturn;
    return "";
}