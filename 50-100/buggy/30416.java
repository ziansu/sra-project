public gameLogic.resource.Train getRandomTrain() {
    int index = random.nextInt(trains.size());
    Util.Tuple<java.lang.String, java.lang.Integer> train = trains.get(index);
    return new gameLogic.resource.Train(train.getFirst(), ((train.getFirst().replaceAll(" ", "")) + ".png"), ((train.getFirst().replaceAll(" ", "")) + "Right.png"), train.getSecond(), index, nextAvailableID);
}