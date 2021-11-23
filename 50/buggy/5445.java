public void addProtectedPoint(me.newyith.fortress.util.Point p, me.newyith.fortress.util.Point anchor) {
    model.protectedPoints.add(p);
    model.generatorRuneByProtectedPoint.put(p, getRune(anchor));
}