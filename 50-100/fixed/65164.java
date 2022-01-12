public java.lang.String comp() {
    java.lang.String co = instruction;
    if (instruction.contains("=")) {
        co = instruction.split("=")[1];
        if (co.contains(";")) {
            co = co.split(";")[0];
        }
    }else
        if (instruction.contains(";")) {
            co = instruction.split(";")[0];
        }
    
    return code.comp(co);
}