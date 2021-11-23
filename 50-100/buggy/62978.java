public boolean addFigureRelationPair(geometry.proofs.FigureRelation pair) {
    if (containsFigureRelationPair(pair))
        return false;
    
    if (relations.add(pair)) {
        if ((pair.getRelationType()) == (FigureRelationType.RIGHT)) {
            final int rightAngleIndex = (relations.size()) - 1;
            makeRightAngle(pair.getFigure0(), rightAngleIndex, pair);
        }
        return true;
    }
    return false;
}