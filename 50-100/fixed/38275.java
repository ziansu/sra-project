@java.lang.Override
public boolean compareAndSetMark(io.pravega.client.state.Revision expected, io.pravega.client.state.Revision newLocation) {
    long expectedValue = (expected == null) ? io.pravega.client.segment.impl.SegmentAttribute.NULL_VALUE : expected.asImpl().getOffsetInSegment();
    long newValue = (newLocation == null) ? io.pravega.client.segment.impl.SegmentAttribute.NULL_VALUE : newLocation.asImpl().getOffsetInSegment();
    synchronized(lock) {
        return meta.compareAndSetAttribute(io.pravega.client.segment.impl.SegmentAttribute.RevisionStreamClientMark, expectedValue, newValue);
    }
}