public static java.util.List<org.apache.drill.common.logical.data.Order.Ordering> getOrdering(org.eigenbase.rel.RelCollation collation, org.eigenbase.reltype.RelDataType rowType) {
    java.util.List<org.apache.drill.common.logical.data.Order.Ordering> orderExpr = com.google.common.collect.Lists.newArrayList();
    final java.util.List<java.lang.String> childFields = rowType.getFieldNames();
    for (org.eigenbase.rel.RelFieldCollation fc : collation.getFieldCollations()) {
        org.apache.drill.common.expression.FieldReference fr = new org.apache.drill.common.expression.FieldReference(childFields.get(fc.getFieldIndex()), org.apache.drill.common.expression.ExpressionPosition.UNKNOWN, false);
        orderExpr.add(new org.apache.drill.common.logical.data.Order.Ordering(fc.getDirection(), fr, fc.nullDirection));
    }
    return orderExpr;
}