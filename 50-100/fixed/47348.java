public static <T, V> java.util.Comparator<T> propertyComparator(java.lang.String propertyName, java.util.List<V> propertyValues, org.apache.commons.collections4.comparators.FixedOrderComparator.UnknownObjectBehavior unknownObjectBehavior) {
    org.apache.commons.lang3.Validate.notBlank(propertyName, "propertyName can't be blank!");
    org.apache.commons.lang3.Validate.notNull(propertyValues, "propertyValues can't be null!");
    org.apache.commons.collections4.comparators.FixedOrderComparator<V> fixedOrderComparator = new org.apache.commons.collections4.comparators.FixedOrderComparator(propertyValues);
    fixedOrderComparator.setUnknownObjectBehavior(unknownObjectBehavior);
    return new com.feilong.core.util.comparator.PropertyComparator(propertyName, fixedOrderComparator);
}