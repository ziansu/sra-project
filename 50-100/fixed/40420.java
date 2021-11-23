private void findBestValueForField(java.lang.String field) {
    quickml.supervised.predictiveModelOptimizer.PredictiveModelOptimizer.FieldLosses losses = new quickml.supervised.predictiveModelOptimizer.PredictiveModelOptimizer.FieldLosses();
    quickml.supervised.predictiveModelOptimizer.FieldValueRecommender fieldValueRecommender = valuesToTest.get(field);
    for (java.lang.Object value : fieldValueRecommender.getValues()) {
        bestConfig.put(field, value);
        losses.addFieldLoss(value, crossValidator.getLossForModel(bestConfig));
        if (!(fieldValueRecommender.shouldContinue(losses.getLosses())))
            break;
        
    }
    bestConfig.put(field, losses.valueWithLowestLoss());
}