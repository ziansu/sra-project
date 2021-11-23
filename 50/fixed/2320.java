public edu.uah.cpe.traintrax.TrainInfo find(java.lang.String trainID) {
    edu.uah.cpe.traintrax.TrainInfo firstMatch = null;
    for (edu.uah.cpe.traintrax.TrainInfo trainInfo : trainList) {
        if (trainInfo.getTrainID().equals(trainID)) {
            firstMatch = trainInfo;
            break;
        }
    }
    return firstMatch;
}