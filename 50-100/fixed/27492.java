private double produce(com.interview.Engine engine, int quantity) {
    int batch = 0;
    int batchCount = 0;
    double costPerBatch = engine.getBatchCost();
    while (batch < quantity) {
        batch = batch + (engine.getBatchSize());
        batchCount++;
    } 
    return batchCount * costPerBatch;
}