public model.TrackColor drawVisibleTrainCar(int index) throws server.exception.OutOfBoundsException {
    if (!(this.canDrawVisibleTrainCar(index))) {
        throw new server.exception.OutOfBoundsException();
    }else {
        model.TrackColor output = visibleTrainCarCards[index];
        visibleTrainCarCards[index] = deckTrainCarCards.get(0);
        deckTrainCarCards.remove(0);
        return output;
    }
}