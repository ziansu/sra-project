public void setWestExit(model.roomModel.Location westExit) {
    location.setWestExit(westExit);
    location.addAction(Action.goWest);
}