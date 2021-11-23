private org.mom47.chess.model.Point moveHorseDownRight(org.mom47.chess.model.Point position) {
    if (((position.getRank()) > 0) && ((position.getFile()) < 7)) {
        int newFileValue = (position.getFile()) + 1;
        int newRankValue = (position.getRank()) - 2;
        return new org.mom47.chess.model.Point(newFileValue, newRankValue);
    }else {
        return position;
    }
}