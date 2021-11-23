public void setWestExit(model.roomModel.Location westExit) {
    location.westExit = westExit;
    location.addAction(Action.goWest);
}