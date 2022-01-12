public void storeInstanceField(soot.Value base, soot.SootField field, soot.Value from) {
    if (!(field.isStatic())) {
        soot.jimple.InstanceFieldRef ref = soot.jimple.Jimple.v().newInstanceFieldRef(base, field.makeRef());
        body.getUnits().add(soot.jimple.Jimple.v().newAssignStmt(ref, from));
    }
}