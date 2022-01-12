@java.lang.Override
boolean o_TupleElementsInRangeAreInstancesOf(final com.avail.descriptor.AvailObject object, final int startIndex, final int endIndex, final com.avail.descriptor.A_Type type) {
    return (com.avail.descriptor.IntegerRangeTypeDescriptor.bytes().isSubtypeOf(type)) || (super.o_TupleElementsInRangeAreInstancesOf(object, startIndex, endIndex, type));
}