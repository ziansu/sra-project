public void addMemory(double[] featureVec, double truth) {
    if ((index) < (capacity)) {
        trainX.add(index, featureVec);
        trainy.add(index, truth);
        (index)++;
    }else {
        int replaceInd = 0;
        if (cs221.neuralnetwork.ReplayMemory.RANDOM_STORAGE) {
            replaceInd = randgen.nextInt(capacity);
        }
        trainX.add(replaceInd, featureVec);
        trainy.add(replaceInd, truth);
    }
}