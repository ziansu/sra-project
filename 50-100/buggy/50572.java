private void SLTUInstruction() {
    int rd = file.nextInt();
    file.next();
    int rs = file.nextInt();
    file.next();
    int rt = file.nextInt();
    file.nextLine();
    int funct = 0;
    int sa = 0;
    java.lang.String opc = "SLTU";
    ilist.add(((interfaces.IInstruction) (new model.RTypeInstruction(opc, rd, rs, rt, sa, funct))));
}