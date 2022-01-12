private void SLLInstruction() {
    int rd = file.nextInt();
    int rs = file.nextInt();
    int sa = file.nextInt();
    file.nextLine();
    int funct = 0;
    int rt = 0;
    java.lang.String opc = "SLL";
    ilist.add(((interfaces.IInstruction) (new model.RTypeInstruction(opc, rd, rs, rt, sa, funct))));
}