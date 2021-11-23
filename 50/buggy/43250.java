private void handlePerpendicularPair(geometry.proofs.FigureRelation pair) {
    java.lang.String angleName = util.Utils.getAngleBetween(pair.getFigure0(), pair.getFigure1());
    diagram.makeRightAngle(angleName, pair);
}