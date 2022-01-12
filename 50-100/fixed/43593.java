public void storeInstanceField(soot.Value base, soot.SootField field, soot.Value from) {
    if (!(field.isStatic())) {
        body.getUnits().add(soot.jimple.Jimple.v().newAssignStmt(soot.jimple.Jimple.v().newInstanceFieldRef(base, field.makeRef()), from));
    }
}