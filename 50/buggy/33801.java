private int anchorKey(impl.Node anchor) {
    return ((java.lang.Double) ((anchor.getCost()) + ((Constants.w1) * (impl.ManhattanDistance.calculate(anchor.getState()))))).intValue();
}