@java.lang.Override
public com.speedment.runtime.field.comparator.FieldComparator<ENTITY, V> reversed() {
    return new com.speedment.runtime.field.internal.comparator.ReferenceFieldComparatorImpl(field, nullOrder, reversed);
}