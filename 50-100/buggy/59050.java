public static java.util.List<org.apache.tajo.plan.Target> schemaToTargets(org.apache.tajo.plan.util.Schema schema) {
    java.util.List<org.apache.tajo.plan.Target> targets = new java.util.ArrayList<>();
    org.apache.tajo.plan.util.FieldEval eval;
    for (int i = 0; i < (schema.size()); i++) {
        eval = new org.apache.tajo.plan.util.FieldEval(schema.getColumn(i));
        targets.set(i, new org.apache.tajo.plan.Target(eval));
    }
    return targets;
}