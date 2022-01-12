public java.lang.Object visit(dbms.IdExp exp, java.util.Hashtable<java.lang.String, java.lang.Integer> attrPosTable, dbms.Tuple tuple) {
    java.lang.String attrName = exp.getId();
    dbms.Value value;
    value = tuple.get(attrPosTable.get(attrName).intValue());
    return visit(exp, value);
}