public java.util.ArrayList<ca.mcgill.mcb.pcingola.interval.Regulation> getRegulationList(java.lang.String cellType) {
    java.util.ArrayList<ca.mcgill.mcb.pcingola.interval.Regulation> regs = regByCell.get(cellType);
    if (regs == null) {
        regs = new java.util.ArrayList<ca.mcgill.mcb.pcingola.interval.Regulation>();
        regByCell.put(cellType, regs);
    }
    return regs;
}