private java.lang.Double anchorKey(impl.Node anchor) {
    return (anchor.getCost()) + ((Constants.w1) * (impl.ManhattanDistance.calculate(anchor.getState())));
}