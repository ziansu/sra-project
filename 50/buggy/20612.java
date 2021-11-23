@java.lang.Override
public int hashCode() {
    int result = ((traceSegmentId) != null) ? traceSegmentId.hashCode() : 0;
    result = (31 * result) + (spanId);
    return result;
}