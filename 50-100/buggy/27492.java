private double produce(com.interview.Engine engine, int quantity) {
    int batch = engine.getBatchSize();
    int batchCount = 0;
    double costPerBatch = engine.getBatchCost();
    while (batch < quantity) {
        batch = batch + 8;
        batchCount++;
    } 
    return batchCount * costPerBatch;
}