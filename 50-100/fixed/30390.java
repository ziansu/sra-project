public boolean move(model.Spot newSpot) {
    if ((newSpot.isOccupied()) == true) {
        newSpot.getOccupyingMarble().moveToHomeSpot();
    }
    if ((newSpot.setMarble(this)) == true) {
        if ((_CurrentSpot) != null) {
            _CurrentSpot.clearMarble();
        }
        _CurrentSpot = newSpot;
        notifyListeners(this, newSpot);
        return true;
    }else {
        return false;
    }
}