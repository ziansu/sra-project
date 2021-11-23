public DeterminizationTree doStep(char s) {
    (this.currentIteration)++;
    if (nodelist.isEmpty()) {
        return 0;
    }
    DeterminizationTree toRet = this.deepCopy();
    toRet.doRecursiveStep(s, toRet.nodelist.iterator().next());
    return toRet;
}