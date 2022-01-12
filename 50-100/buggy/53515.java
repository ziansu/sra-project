public boolean validityCheck(problem.ASVConfig c) {
    return ((((tester.hasEnoughArea(c)) && (tester.fitsBounds(c))) && (tester.isConvex(c))) && (tester.hasValidBoomLengths(c))) && ((rotatesLeft(c)) == (this.rotatesLeft));
}