@java.lang.Override
public org.apache.apex.malhar.lib.state.spillable.SpillableSetImpl.ListNode<T> deserialize(com.datatorrent.netlet.util.Slice slice, org.apache.commons.lang3.mutable.MutableInt offset) {
    org.apache.apex.malhar.lib.state.spillable.SpillableSetImpl.ListNode<T> result = new org.apache.apex.malhar.lib.state.spillable.SpillableSetImpl.ListNode<>();
    result.valid = (slice.buffer[offset.intValue()]) != 0;
    result.next = serde.deserialize(slice, offset);
    return result;
}