private boolean hasGradeWithinRange(module.siadap.domain.wrappers.PersonSiadapWrapper personSiadapWrapper) {
    module.siadap.domain.Siadap siadap = personSiadapWrapper.getSiadap();
    module.siadap.domain.scoring.SiadapGlobalEvaluation globalEvaluationEnum = siadap.getSiadapGlobalEvaluationEnum(siadapUniverseToConsider, considerValidatedOnly);
    if (globalEvaluationEnum.equals(SiadapGlobalEvaluation.EXCELLENCY)) {
        return (siadapGlobalEvaluation.equals(SiadapGlobalEvaluation.HIGH)) || (siadapGlobalEvaluation.equals(SiadapGlobalEvaluation.EXCELLENCY));
    }
    return siadap.hasGivenSiadapGlobalEvaluation(siadapGlobalEvaluation, siadapUniverseToConsider, considerValidatedOnly);
}