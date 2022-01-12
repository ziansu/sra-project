public DeterminizationTree doStep(char s) {
    (this.currentIteration)++;
    DeterminizationTree toRet = this.deepCopy();
    if (nodelist.isEmpty()) {
        return toRet;
    }
    toRet.doRecursiveStep(s, toRet.nodelist.iterator().next());
    return toRet;
}