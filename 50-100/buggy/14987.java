public void run() {
    while ((pc) < (instructions.size())) {
        cz.cvut.fit.brabepa1.run.interpret.instructions.Instruction ins = instructions.get(pc);
        ins.execute(this);
        java.lang.System.out.println(ins.toString());
        java.lang.System.out.println(this);
    } 
}