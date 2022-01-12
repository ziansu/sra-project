public boolean validityCheck(problem.ASVConfig c) {
    return ((((tester.hasEnoughArea(c)) && (tester.fitsBounds(c))) && (tester.isConvex(c))) && (tester.hasValidBoomLengths(c))) && ((rotatesLeft(c, 0)) == (this.rotatesLeft));
}