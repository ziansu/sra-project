public void commonSubexprElim() {
    Instruction equivInstr;
    for (Instruction currentInstr : program.instrs) {
        if (deletable(currentInstr.op)) {
            equivInstr = currentInstr.equivDominatingInstr();
            if (equivInstr != null) {
                for (Instruction useSite : currentInstr.uses) {
                    useSite.replace(currentInstr, equivInstr);
                }
                currentInstr.delete();
            }
        }
    }
}