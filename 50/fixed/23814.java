public com.remulasce.lametroapp.dynamic_data.types.Prediction makePrediction() {
    if ((prediction) == null) {
        com.remulasce.lametroapp.basic_types.Stop s = new com.remulasce.lametroapp.basic_types.Stop(raw);
        prediction = new com.remulasce.lametroapp.dynamic_data.types.StopPrediction(s, null);
    }
    return prediction;
}