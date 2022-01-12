public void setCalcComplexity() {
    thesis.pmd.fragment.initial.Complexity tempComp = new thesis.pmd.fragment.initial.Complexity(this.complexity);
    tempComp.multiply(this.loopComplexity);
    this.calcComplexity.multiply(tempComp);
}