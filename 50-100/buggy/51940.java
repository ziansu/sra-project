private void BEQInstruction() {
    int rs = file.nextInt();
    file.next();
    int rd = file.nextInt();
    file.next();
    java.lang.String label = file.next();
    file.nextLine();
    int imm = getImmediateFromLable(label);
    java.lang.String opc = "BEQ";
    ilist.add(((interfaces.IInstruction) (new model.BranchInstruction(opc, rd, rs, imm, label))));
}