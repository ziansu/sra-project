public com.rapleaf.jack.queries.GenericConstraint notIn(T... values) {
    if (isDateColumn()) {
        return createDateConstraint(new com.rapleaf.jack.queries.where_operators.NotIn(java.util.Arrays.copyOf(values, values.length, java.lang.Long[].class)));
    }else {
        return new com.rapleaf.jack.queries.GenericConstraint<T>(this, new com.rapleaf.jack.queries.where_operators.NotIn<T>(values));
    }
}