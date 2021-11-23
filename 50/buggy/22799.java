@java.lang.Override
public int compareTo(gobblin.writer.AcknowledgableWatermark o) {
    com.google.common.base.Preconditions.checkArgument((o instanceof gobblin.writer.AcknowledgableWatermark));
    return _checkpointableWatermark.compareTo(o._checkpointableWatermark);
}