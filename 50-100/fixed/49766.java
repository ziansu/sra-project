private org.mom47.chess.model.Point moveHorseDownRight(org.mom47.chess.model.Point position) {
    if (((position.getFile()) < 7) && ((position.getRank()) > 0)) {
        int newFileValue = (position.getFile()) + 1;
        int newRankValue = (position.getRank()) - 2;
        if ((newFileValue > 7) || (newRankValue < 0)) {
            return position;
        }else {
            return new org.mom47.chess.model.Point(newFileValue, newRankValue);
        }
    }else {
        return position;
    }
}