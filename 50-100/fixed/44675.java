private void handleStepPercept(figure.percept.StepPercept p) {
    figure.FigureInfo fig = p.getFigure();
    animation.AnimationSet set = animation.AnimationUtils.getFigure_walking(fig);
    if (set != null) {
        screen.startAnimation(set, fig, Position.Pos.fromValue(p.getFromIndex()), Position.Pos.fromValue(p.getToIndex()));
    }
}