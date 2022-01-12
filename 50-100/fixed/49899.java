private void SLTIUInstruction() {
    int rd = file.nextInt();
    int rs = file.nextInt();
    int imm = file.nextInt();
    file.nextLine();
    java.lang.String opc = "SLTIU";
    ilist.add(((interfaces.IInstruction) (new model.ITypeInstruction(opc, rd, rs, imm))));
}