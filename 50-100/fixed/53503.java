private void LWInstruction() {
    int rd = file.nextInt();
    int imm = file.nextInt();
    int rs = file.nextInt();
    file.nextLine();
    java.lang.String opc = "LW";
    ilist.add(((interfaces.IInstruction) (new model.ITypeInstruction(opc, rd, rs, imm))));
}