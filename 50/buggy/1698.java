public com.github.dkellenb.formulaevaluator.FormulaEvaluator setConfiguration(com.github.dkellenb.formulaevaluator.FormulaEvaluatorConfiguration configuration) {
    com.github.dkellenb.formulaevaluator.FormulaEvaluator.checkNotNull(configuration, "Formula evaluator configuration should never be null");
    if (!(configuration.isModifiable())) {
        this.configuration = new com.github.dkellenb.formulaevaluator.FormulaEvaluatorConfiguration(configuration);
    }
    this.configuration = configuration;
    return this;
}