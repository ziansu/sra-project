private void SRLInstruction() {
    int rd = file.nextInt();
    file.next();
    int rs = file.nextInt();
    file.next();
    int sa = file.nextInt();
    file.nextLine();
    int funct = 8;
    int rt = 0;
    java.lang.String opc = "SRL";
    ilist.add(((interfaces.IInstruction) (new model.RTypeInstruction(opc, rd, rs, rt, sa, funct))));
}