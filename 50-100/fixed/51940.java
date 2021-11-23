private void BEQInstruction() {
    int rs = file.nextInt();
    int rd = file.nextInt();
    java.lang.String label = file.next();
    file.nextLine();
    int imm = getImmediateFromLable(label);
    java.lang.String opc = "BEQ";
    ilist.add(((interfaces.IInstruction) (new model.BranchInstruction(opc, rd, rs, imm, label))));
}