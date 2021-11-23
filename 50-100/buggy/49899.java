private void SLTIUInstruction() {
    int rd = file.nextInt();
    file.next();
    int rs = file.nextInt();
    file.next();
    int imm = file.nextInt();
    file.nextLine();
    java.lang.String opc = "SLTIU";
    ilist.add(((interfaces.IInstruction) (new model.ITypeInstruction(opc, rd, rs, imm))));
}