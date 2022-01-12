private org.mom47.chess.model.Point moveHorseDownLeft(org.mom47.chess.model.Point position) {
    if (((position.getFile()) > 0) && ((position.getRank()) > 0)) {
        int newFileValue = (position.getFile()) - 1;
        int newRankValue = (position.getRank()) - 2;
        return new org.mom47.chess.model.Point(newFileValue, newRankValue);
    }else {
        return position;
    }
}