protected double calculate_M_step() {
    assignClusterIndex();
    MLELanguageModels();
    return MLELogisticModels();
}