@java.lang.Override
public org.apache.calcite.rel.RelNode visit(org.apache.calcite.rel.logical.LogicalAggregate rel) {
    if (!(((((org.apache.calcite.rel.logical.LogicalAggregate) (rel)).getAggCallList().isEmpty()) == false) || ((((org.apache.calcite.rel.logical.LogicalAggregate) (rel)).indicator) == true))) {
        this.mightRequireValueGen = false;
        return super.visit(rel);
    }
    return rel;
}