public final synchronized org.optimizationBenchmarking.experimentation.evaluation.impl.evaluator.data.ModuleEntryBuilder addModule() {
    this.fsmStateAssert(BuilderFSM.STATE_OPEN);
    this.fsmFlagsAssertAndUpdate(FSM.FLAG_NOTHING, FSM.FLAG_NOTHING, org.optimizationBenchmarking.experimentation.evaluation.impl.evaluator.data.EvaluationModulesBuilder.FLAG_MODULE_ADDED, FSM.FLAG_NOTHING);
    return new org.optimizationBenchmarking.experimentation.evaluation.impl.evaluator.data.ModuleEntryBuilder(this);
}