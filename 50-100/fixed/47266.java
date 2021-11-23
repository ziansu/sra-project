private void addTrapBoundary(soot.jimple.toolkits.base.Unit unit, soot.jimple.toolkits.base.Trap t, java.util.Map<soot.jimple.toolkits.base.Unit, java.util.List<soot.jimple.toolkits.base.Trap>> unitToTrapBoundaries) {
    java.util.List<soot.jimple.toolkits.base.Trap> boundary = unitToTrapBoundaries.get(unit);
    if (boundary == null) {
        boundary = new java.util.ArrayList<soot.jimple.toolkits.base.Trap>();
        unitToTrapBoundaries.put(unit, boundary);
    }
    boundary.add(t);
}