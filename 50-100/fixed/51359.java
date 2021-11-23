@java.lang.Override
public org.apache.calcite.rel.RelNode visit(org.apache.calcite.rel.logical.LogicalAggregate rel) {
    if (((((org.apache.calcite.rel.logical.LogicalAggregate) (rel)).getAggCallList().isEmpty()) == true) && ((((org.apache.calcite.rel.logical.LogicalAggregate) (rel)).indicator) == false)) {
        this.mightRequireValueGen = false;
        return super.visit(rel);
    }else {
        this.mightRequireValueGen = true;
        return rel;
    }
}