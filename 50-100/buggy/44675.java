private void handleStepPercept(figure.percept.StepPercept p) {
    figure.FigureInfo fig = p.getFigure();
    dungeon.RoomInfo info = fig.getRoomInfo();
    animation.AnimationSet set = animation.AnimationUtils.getFigure_walking(fig);
    int fromIndex = p.getFromIndex();
    int toIndex = p.getToIndex();
    if (set != null) {
        screen.startAnimation(set, fig, Position.Pos.fromValue(p.getFromIndex()), Position.Pos.fromValue(p.getToIndex()));
    }
}