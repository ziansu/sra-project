void run() {
    while ((pc) < (prog.size())) {
        AoC23b.Asm asm = prog.get(pc);
        pc = asm.apply();
        java.lang.System.out.println(((("Pc: " + (pc)) + ", Regs: ") + (java.util.Arrays.toString(reg))));
    } 
    java.lang.System.out.println(((("Pc: " + (pc)) + ", Regs: ") + (java.util.Arrays.toString(reg))));
}