public void addObjectiveIndicator(java.lang.String measurementIndicator, java.lang.String superationCriteria, java.math.BigDecimal ponderationFactor) {
    java.math.BigDecimal sum = java.math.BigDecimal.ZERO;
    for (module.siadap.domain.ObjectiveEvaluationIndicator indicator : getIndicators()) {
        sum = sum.add(indicator.getPonderationFactor());
    }
    if ((sum.add(ponderationFactor).compareTo(java.math.BigDecimal.ONE)) > 0) {
        throw new module.siadap.domain.exceptions.SiadapException("resources/SiadapResources", "error.ponderation.cannot.be.over.100");
    }
    checkSizeOfIndicators();
    new module.siadap.domain.ObjectiveEvaluationIndicator(this, measurementIndicator, superationCriteria, ponderationFactor);
}