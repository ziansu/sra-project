protected boolean checkIfWin(jumpingalien.model.Characters mazub) {
    jumpingalien.model.Position mazubPosition = new jumpingalien.model.Position(mazub.getIntPositionAt(1), ((mazub.getIntPositionAt(2)) + 1));
    mazubPosition = mazubPosition.toScale(Scale.TILE);
    if (mazubPosition.equals(getTargetPosition())) {
        this.setPlayerWon(true);
        return true;
    }else {
        return false;
    }
}