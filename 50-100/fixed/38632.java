private void ANDInstruction() {
    int rd = file.nextInt();
    int rs = file.nextInt();
    int rt = file.nextInt();
    file.nextLine();
    int funct = 100100;
    int sa = 0;
    java.lang.String opc = "AND";
    ilist.add(((interfaces.IInstruction) (new model.RTypeInstruction(opc, rd, rs, rt, sa, funct))));
}