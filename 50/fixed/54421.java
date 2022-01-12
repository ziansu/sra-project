@java.lang.Override
public cz.cvut.fit.mi_paa.booolean_satisfability.Result getResult(java.lang.Integer loopCount, cz.cvut.fit.mi_paa.booolean_satisfability.domain.Formula formula) {
    this.loopCount = loopCount;
    this.formula = formula;
    createResult();
    return result;
}