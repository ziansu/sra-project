@java.lang.Override
public java.util.List<java.lang.Integer> evaluate(org.batfish.datamodel.routing_policy.Environment environment) {
    java.util.List<java.lang.Integer> list = new java.util.ArrayList(_list.size());
    for (org.batfish.datamodel.routing_policy.expr.AsExpr expr : _list) {
        int as = expr.evaluate(environment);
        list.add(as);
    }
    return list;
}