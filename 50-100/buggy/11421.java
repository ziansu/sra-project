@java.lang.SafeVarargs
public static <V, T> java.util.Comparator<T> propertyComparator(java.lang.String propertyName, V... propertyValues) {
    org.apache.commons.lang3.Validate.notBlank(propertyName, "propertyName can't be blank!");
    org.apache.commons.lang3.Validate.notNull(propertyValues, "propertyValues can't be null!");
    return com.feilong.core.util.comparator.BeanComparatorUtil.propertyComparator(propertyName, com.feilong.core.bean.ConvertUtil.toList(propertyValues));
}