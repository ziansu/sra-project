public boolean move(model.Spot newSpot) {
    if ((newSpot.isOccupied()) == true) {
        newSpot.getOccupyingMarble().moveToHomeSpot();
        notifyListeners(newSpot.getOccupyingMarble(), newSpot.getOccupyingMarble().getCurrentSpot());
    }
    if ((newSpot.setMarble(this)) == true) {
        _CurrentSpot.clearMarble();
        _CurrentSpot = newSpot;
        notifyListeners(this, newSpot);
        return true;
    }else {
        return false;
    }
}