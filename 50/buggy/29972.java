public void addInstruction(Instruction inst) throws java.lang.Exception {
    instructions.add(inst);
    inst.validate();
    java.lang.System.out.println(inst.toBinary());
}