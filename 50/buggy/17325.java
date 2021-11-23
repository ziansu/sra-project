public org.jLOAF.casebase.Case getCasePastOffset(int time) {
    return this.run.get((((this.getRunLength()) - 1) - time));
}