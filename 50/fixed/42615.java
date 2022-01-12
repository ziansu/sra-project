void merge(hivemall.evaluation.F1ScoreUDAF.Evaluator.PartialResult other) {
    this.tp += other.tp;
    this.totalActual += other.totalActual;
    this.totalPredicted += other.totalPredicted;
}