@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if ((o == null) || ((getClass()) != (o.getClass())))
        return false;
    
    io.datakernel.aggregation.AggregationPredicates.PredicateEq that = ((io.datakernel.aggregation.AggregationPredicates.PredicateEq) (o));
    if (!(key.equals(that.key)))
        return false;
    
    return (value) != null ? value.equals(that.value) : (that.value) == null;
}